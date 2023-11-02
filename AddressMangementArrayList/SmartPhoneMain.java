package AddressMangementArrayList;

import java.util.Scanner;

public class SmartPhoneMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SmartPhone smartPhone = new SmartPhone();
		
		System.out.println("데이터를 2개 입력하세요.");
		for(int i=0; i<2; i++)	{
			smartPhone.saveAddress(smartPhone.inputAddress());
			System.out.println("--------------------------------");
		}
		
		while(true)	{
			smartPhone.printMenu();
			int num = sc.nextInt();
			sc.nextLine();
			switch(num)	{
			case 1:
				smartPhone.saveAddress(smartPhone.inputAddress());
				break;
			case 2:
				smartPhone.printAllAddress();
				break;
			case 3:
				System.out.print("찾으시려는 연락처의 이름을 입력하세요 >>>");
				smartPhone.searchAddress(sc.nextLine());
				break;
			case 4:
				System.out.print("삭제하려는 연락처의 이름을 입력하세요 >>>");
				smartPhone.deleteAddress(sc.nextLine());
				break;
			case 5:
				System.out.println("수정하려는 연락처의 이름을 입력하세요 >>>");
				smartPhone.modifyAddress(sc.nextLine(), smartPhone.inputAddress());
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