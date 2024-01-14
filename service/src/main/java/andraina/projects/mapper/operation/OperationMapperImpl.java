package andraina.projects.mapper.operation;

import andraina.projects.dto.OperationDto;
import andraina.projects.entity.OperationDo;

public class OperationMapperImpl implements OperationMapper{

	@Override
	public OperationDto toDto(OperationDo operationDo) {
		OperationDto operationDto = new OperationDto(
				operationDo.getOperationType(),
				operationDo.getAmount(),
				operationDo.getOperationDate(),
				operationDo.getBalance()
				);
		return operationDto;
	}
	
	

}
