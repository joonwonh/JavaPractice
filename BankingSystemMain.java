package MiniProject2;

import java.util.Scanner;

public class BankingSystemMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		
		while(true)	{
			System.out.println("===========메뉴 선택창=============");
			System.out.println("|			번호를 입력해주세요.				 |");
			System.out.println("|--------------------------------------------------|");
			System.out.println("|				1.로그인				 	 |");
			System.out.println("|				2.회원가입					 |");
			System.out.println("|				3.종   료 					 |");
			System.out.println("==============================");
			System.out.print(">>>>>>>");
			String num = sc.nextLine();
			if(num.contentEquals("1"))	{
				System.out.println("계좌번호를 입력하세요.");
				String acNo = sc.nextLine();
				System.out.println("비밀번호를 입력하세요.");
				String pw = sc.nextLine();
				if(bank.login(acNo, pw))	{
					bank.printMenu();
					int nums = sc.nextInt();
					sc.nextLine();
					switch(nums)	{
					case 1:
						bank.balanceCheck(acNo);
//						break;
					case 2:
						System.out.println("입금하실 금액을 입력해주세요.");
						bank.inputMoney(acNo, sc.nextInt());
//						break;
					case 3:
						System.out.println("출금하실 금액을 입력해주세요.");
						bank.outputMoney(acNo,sc.nextInt());
//						break;
					case 4:
						System.out.println("송금 받으실 분의 이름을 입력해주세요.");
						String acNoT = sc.nextLine();
						System.out.println("얼마를 송금하시겠습니까?");
						bank.accountTransfer(acNo,acNoT,sc.nextInt());
//						break;
					case 5:
						break;
					default :
						System.out.println("다시 입력해주세요.");
					}
				}
			}
			else if(num.contentEquals("2"))	{
				bank.saveAccount(bank.accountRegist());
			}
			else if(num.contentEquals("3"))	{
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
			else
				System.out.println("다시 입력해주세요.");
		}
		
		

//		
//		if()
	}

}
