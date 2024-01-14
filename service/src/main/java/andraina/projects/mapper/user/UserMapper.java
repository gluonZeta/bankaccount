package andraina.projects.mapper.user;

import andraina.projects.dto.UserDto;
import andraina.projects.entity.UserDo;

public interface UserMapper {
	public UserDto toDto(UserDo userDo);
}
