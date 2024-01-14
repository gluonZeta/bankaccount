package andraina.projects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import andraina.projects.UserRepository;
import andraina.projects.dto.UserDto;
import andraina.projects.entity.UserDo;
import andraina.projects.mapper.user.UserMapper;
import andraina.projects.mapper.user.UserMapperImpl;

@Service
public class UserAccountServicImpl implements UserAccountService{
	
	@Autowired
	UserRepository userRepository;
	
	UserMapper userMapper;

	@Override
	public UserDto getUserAccountInformations(String firstname, String code) {
		UserDo userDo = userRepository.findByFirstnameAndCode(firstname, code);
		userMapper = new UserMapperImpl();
		return userMapper.toDto(userDo);
	}

}
