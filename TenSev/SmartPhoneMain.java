package TenSev;

import java.util.Scanner;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SmartPhone smartphone = new SmartPhone();
		
			
		for(int i=0; i<2; i++)	{
			System.out.println("# 데이터 2개를 입력합니다.");
			smartphone.data();
//			
//			System.out.println("# 데이터 2개를 입력합니다.");
//			System.out.print("이름 : ");
//			smartphone.name = sc.nextLine();
//			
//			System.out.print("전화번호 : ");
//			smartphone.no = sc.nextLine();
//
//			System.out.print("이메일 : ");
//			smartphone.mail = sc.nextLine();
//
//			System.out.print("주소 : ");
//			smartphone.address = sc.nextLine();
//	
//			System.out.print("그룹(친구/가족) : ");
//			smartphone.group = sc.nextLine();
//			System.out.println(">>> 데이터가 저장되었습니다. (" + (i+1) + ")");
//			
//			smartphone.addr[i] = new Addr(smartphone.name, smartphone.no,smartphone.mail,smartphone.address, smartphone.group);
		}

		
		while(true)	{
			
			System.out.println("주소관리 메뉴----------------");
			System.out.println(">> 1.연락처 등록\n>> 2.모든 연락처 출력\n>> 3.연락처 검색\n>> 4.연락처 삭제\n>> 5.연락처 수정\n>> 6.프로그램 종료");
			System.out.println("----------------------------");
			int num = sc.nextInt();

			switch(num)		{
			case(1):
				smartphone.data();
				break;
			case(2):
				smartphone.AllPrint();
				break;
			case(3):
				smartphone.search();
				break;
			case(4):
				smartphone.delete();
				break;
			case(5):
				smartphone.modify();
				break;
			case(6):
				System.out.println("종료합니다.");
				System.exit(0);
			break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				break;
			}
		}
		
	}

}
