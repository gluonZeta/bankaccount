package andraina.projects.dto;

public class UserDto {
	
	private String lastname;
	
	private String firstname;
	
	private String code;
	
	private Long balance;
	
	public UserDto() {}

	public UserDto(String lastname, String firstname, String code) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.code = code;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

}
