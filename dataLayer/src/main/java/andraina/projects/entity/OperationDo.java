package andraina.projects.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "operation")
public class OperationDo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "operation_type")
	private String operationType;
	
	@Column(name = "amount")
	private Long amount;
	
	@Column(name = "operation_date")
	private LocalDateTime operationDate;
	
	@Column(name = "balance")
	private Long balance;
	
	@ManyToOne
	@JoinColumn(name = "account_id")
	private AccountDo accountDo;
	
	public OperationDo() {}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public AccountDo getAccount() {
		return accountDo;
	}

	public void setAccount(AccountDo account) {
		this.accountDo = account;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}
}
