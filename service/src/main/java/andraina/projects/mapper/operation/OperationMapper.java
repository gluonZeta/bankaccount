package andraina.projects.mapper.operation;

import andraina.projects.dto.OperationDto;
import andraina.projects.entity.OperationDo;

public interface OperationMapper {
	public OperationDto toDto(OperationDo operationDo);
}
