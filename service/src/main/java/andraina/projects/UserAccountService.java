package andraina.projects;

import andraina.projects.dto.UserDto;

public interface UserAccountService {
	public UserDto getUserAccountInformations(String firstname, String code);
}
