package andraina.projects.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class AccountDo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "balance")
	private Long balance;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private UserDo userDo;
	
	@OneToMany(mappedBy = "accountDo", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<OperationDo> operationsDo;
	
	public AccountDo() {};

	public AccountDo(Long balance, UserDo userDo) {
		super();
		this.balance = balance;
		this.userDo = userDo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public UserDo getUser() {
		return userDo;
	}

	public void setUser(UserDo userDo) {
		this.userDo = userDo;
	}

	public Set<OperationDo> getOperations() {
		return operationsDo;
	}

	public void setOperations(Set<OperationDo> operations) {
		this.operationsDo = operations;
	}
	
}
