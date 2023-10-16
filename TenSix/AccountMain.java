package TenSix;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account account = new Account();
		System.out.println("계좌 정보를 입력하세요");
		System.out.print("계좌 명의 : ");
		account.name = sc.nextLine();
		System.out.print("계좌 번호 : ");
		account.accountNumber = sc.nextInt();
		System.out.print("잔고 : ");
		account.accountBalance = sc.nextInt();
		System.out.println("계좌 기본 정보 {" +account.name + "," +account.accountNumber + "," + account.accountBalance + "}");
		System.out.print("출금액 : ");
		account.deposit = sc.nextInt();
		System.out.println("잔금은 " + (account.accountBalance - account.deposit) +"입니다.");
		
		sc.close();
	}

}
