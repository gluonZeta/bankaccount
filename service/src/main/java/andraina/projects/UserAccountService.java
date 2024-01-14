package andraina.projects;

import java.util.List;

import andraina.projects.dto.OperationDto;
import andraina.projects.dto.UserDto;

public interface UserAccountService {
	
	public UserDto getUserAccountInformations(String firstname, String code);
	
	public UserDto operation(String firstname, String code, String amount, String operationType);
	
	public List<OperationDto> getOperationHistory(String firstname, String code);
	
	
}
