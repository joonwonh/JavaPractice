package MiniProject2;

public class Account {
	
	private String name;
	private String accountNo;
	private String password;
	private int balance;
	
	public Account( String name, String accountNo, String password,int balance) {
		this.name = name;
		this.accountNo = accountNo;
		this.password = password;
		this.balance = balance;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	
	
}
