package BankAccountEx;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount a1 = new BankAccount(10000);
		BankAccount a2 = new BankAccount(0);
		
		System.out.println("a1 :   " + a1);
		System.out.println("a2 :   " + a2);
		System.out.println();
		a1.transfer(1000, a2);
		System.out.println("a1 :   " + a1);
		System.out.println("a2 :   " + a2);
		System.out.println();
		a1.transfer(5000, a2);
		System.out.println("a1 :   " + a1);
		System.out.println("a2 :   " + a2);
		
	}

}
