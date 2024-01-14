package andraina.projects.dto;

import java.time.LocalDateTime;

public class OperationDto {
	
	private String operationType;
	
	private Long amount;
	
	private LocalDateTime operationDate;
	
	private Long balance;
	
	public OperationDto() {};

	public OperationDto(String operationType, Long amount, LocalDateTime operationDate, Long balance) {
		super();
		this.operationType = operationType;
		this.amount = amount;
		this.operationDate = operationDate;
		this.balance = balance;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public LocalDateTime getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(LocalDateTime operationDate) {
		this.operationDate = operationDate;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}
}
