package MiniProject2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {

	Scanner sc =new Scanner(System.in);
	List<Account> account = new ArrayList<>();
	
	public boolean login(String acNo, String pw)	{
		for(int i=0; i<account.size(); i++)		{
			if(account.get(i).getAccountNo().equals(acNo))	{
				System.out.println("로그인 성공!");
				System.out.println(account.get(i).getName() + "님 환영합니다.");
				return true;
			}
		}System.out.println("계좌번호 또는 비밀번호가 올바르지 않습니다.");
		return false;
	}
	
	public Account accountRegist()	{
		System.out.print("성함을 입력해주세요 >> ");
		String name = sc.nextLine();
		System.out.print("계좌번호를 입력해주세요 >> ");
		String accountNo = sc.nextLine();
		System.out.print("비밀번호를 입력해주세요 >> ");
		String pw = sc.nextLine();
		System.out.print("잔액을 입력해주세요 >> ");
		int balance = sc.nextInt();
		
		Account ac = new Account(name, accountNo, pw, balance);
		return ac;
	}
	public void saveAccount(Account ac)	{
		account.add(ac);
		System.out.println("회원가입 성공!");
		System.out.println();
		System.out.println();
	}
	
	public void printMenu()	{
		System.out.println("1. 잔액조회");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 송금");
		System.out.println("5. 초기화면 돌아가기");
	}
	public void balanceCheck(String acNo)	{
		for(int i=0; i<account.size(); i++)		{
			if(account.get(i).getAccountNo().equals(acNo))	{
				System.out.println("현재 잔액은 " + account.get(i).getBalance() + "원 입니다.");
				System.out.println();
				System.out.println();
			}
		}
	}
	public void inputMoney(String acNo, int input)	{
		for(int i=0; i<account.size(); i++)		{
			if(account.get(i).getAccountNo().equals(acNo))	{
				account.get(i).setBalance(account.get(i).getBalance()+input);
				System.out.println("입금 후 잔액은 " +( account.get(i).getBalance()) + "원 입니다.");
			}
		}
	}
	public void outputMoney(String acNo, int output)	{
		for(int i=0; i<account.size(); i++)		{
			if(account.get(i).getAccountNo().equals(acNo))	{
				account.get(i).setBalance(account.get(i).getBalance()-output);
				System.out.println("입금 후 잔액은 " +( account.get(i).getBalance()) + "원 입니다.");
			}
		}
	}
	public void accountTransfer(String acNo, String acNoT, int trans)	{
		for(int i=0; i<account.size(); i++)		{
			if(account.get(i).getAccountNo().equals(acNo))	{
				for(int j=0; j<account.size(); j++)		{
					if(account.get(j).getAccountNo().equals(acNoT))	{
						account.get(j).setBalance(account.get(j).getBalance()+trans);
						account.get(i).setBalance(account.get(i).getBalance()-trans);
						System.out.println("송금 후 잔액은 " +( account.get(i).getBalance()) + "원 입니다.");
					}
				}				
			}
		}System.out.println("찾을 수 없습니다.");
	}
	
}













