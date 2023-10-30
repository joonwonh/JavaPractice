package BankAccountEx;

public class BankAccount {
	private int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void transfer(int amount, BankAccount otherAccount)	{
		System.out.println("transfer(" + amount + ") È£Ãâ ÈÄ");
		balance -= amount;
		otherAccount.deposit(amount);
		
	}
	public void deposit(int amount)	{
		setBalance(getBalance()-amount);
	}
	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}
	
}
