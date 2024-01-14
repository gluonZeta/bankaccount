package andraina.projects.mapper.user;

import andraina.projects.dto.UserDto;
import andraina.projects.entity.UserDo;

public class UserMapperImpl implements UserMapper {

	@Override
	public UserDto toDto(UserDo userDo) {
		UserDto userDto = new UserDto(
				userDo.getLastname(),
				userDo.getFirstname(),
				userDo.getCode()
				);
		if(userDo.getAccountDo() != null) userDto.setBalance(userDo.getAccountDo().getBalance());
		return userDto;
	}

}
