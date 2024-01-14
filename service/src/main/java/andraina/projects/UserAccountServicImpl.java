package andraina.projects;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import andraina.projects.dto.OperationDto;
import andraina.projects.dto.UserDto;
import andraina.projects.entity.AccountDo;
import andraina.projects.entity.OperationDo;
import andraina.projects.entity.UserDo;
import andraina.projects.mapper.operation.OperationMapper;
import andraina.projects.mapper.operation.OperationMapperImpl;
import andraina.projects.mapper.user.UserMapper;
import andraina.projects.mapper.user.UserMapperImpl;

@Service
public class UserAccountServicImpl implements UserAccountService{
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	AccountRepository accountRepository;
	
	UserMapper userMapper;
	
	OperationMapper operationMapper;

	@Override
	public UserDto getUserAccountInformations(String firstname, String code) {
		UserDo userDo = userRepository.findByFirstnameAndCode(firstname, code);
		userMapper = new UserMapperImpl();
		return userMapper.toDto(userDo);
	}

	@Override
	@Transactional
	public UserDto operation(String firstname, String code, String amount, String operationType) {
		UserDo userDo = userRepository.findByFirstnameAndCode(firstname, code);
		AccountDo accountDo = userDo.getAccountDo();
		Long operationAmount = Long.parseLong(amount);
		Long balance = null;
		String opType = null;
		switch (operationType) {
		case "W": 
			balance = accountDo.getBalance()- operationAmount;
			opType = ConstanteOperationType.WITHDRAWAL;
			break;
		case "D": 
			balance = accountDo.getBalance()+ operationAmount;
			opType = ConstanteOperationType.DEPOSIT;
			break;
		}
		accountDo.setBalance(balance);
		OperationDo operationDo = new OperationDo(
				opType,
				operationAmount,
				LocalDateTime.now(),
				balance,
				accountDo
				);
		accountDo.getOperations().add(operationDo);
		accountDo = accountRepository.save(accountDo);
		userMapper = new UserMapperImpl();
		return userMapper.toDto(accountDo.getUser());
	}

	@Override
	public List<OperationDto> getOperationHistory(String firstname, String code) {
		UserDo userDo = userRepository.findByFirstnameAndCode(firstname, code);
		AccountDo accountDo = userDo.getAccountDo();
		operationMapper = new OperationMapperImpl();
		List<OperationDto> operations = accountDo.getOperations()
				.stream()
				.map(operation -> operationMapper.toDto(operation))
				.collect(Collectors.toList());
		operations.sort(Comparator.comparing(OperationDto::getOperationDate).reversed());
		return operations;
	}

}
