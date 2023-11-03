package AddressMangementArrayList;

import java.util.Scanner;

public class SmartPhoneMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SmartPhone smartPhone = new SmartPhone();
		
		while(true)	{
			smartPhone.printMenu();
			int num = sc.nextInt();
			sc.nextLine();
			switch(num)	{
			case 1:
				smartPhone.inputAddress();
				break;
			case 2:
				smartPhone.printAllAddress();
				break;
			case 3:
				System.out.print("찾으시려는 연락처의 번호를 입력하세요 >>>");
				smartPhone.searchAddressV(sc.nextLine());
				break;
			case 4:
				System.out.print("삭제하시려는 연락처의 번호를 입력하세요 >>>");
				smartPhone.deleteAddress(sc.nextLine());
				break;
			case 5:
				System.out.println("수정하시려는 연락처의 번호를 입력하세요 >>>");
				smartPhone.modifyAddress(sc.nextLine());
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default :
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
