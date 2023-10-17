package MiniProject1;

import java.util.Scanner;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SmartPhone smartPhone = new SmartPhone();
		
		System.out.println("# 데이터 2개를 입력합니다.");
		for(int i=0; i<2; i++)	{
			smartPhone.addAddr(smartPhone.inputData());
		}
		
		while(true)	{
			printMenu();
			String selectMenu = sc.nextLine();
			
			if(selectMenu.contentEquals("1")) {
				smartPhone.addAddr(smartPhone.inputData());
			}else if(selectMenu.contentEquals("2"))	{
				smartPhone.printAllAddr();
			}else if(selectMenu.contentEquals("3"))	{
				System.out.println("검색하고자하는 이름을 입력해주세요.");
				smartPhone.searchAddr(sc.nextLine());
			}else if(selectMenu.contentEquals("4"))	{
				System.out.println("삭제하고자하는 이름을 입력해주세요.");
				smartPhone.deleteAddr(sc.nextLine());
			}else if(selectMenu.contentEquals("5"))	{
				System.out.println("수정하고자하는 이름을 입력해주세요.");
				String name = sc.nextLine();
				smartPhone.searchAddr(name);
				System.out.println("데이터를 새로 입력해주세요.");
				smartPhone.editAddr(name, smartPhone.inputData());
			}else if(selectMenu.contentEquals("6"))	{
				System.out.println("프로그램을 종료합니다.");
				return;
			}else	{
				System.out.println("잘못된 메뉴입니다. 다시 선택해주세요.");
			}
		}
	}
	private static void printMenu() {
		System.out.println("주소관리 메뉴----------------");
		System.out.println(">> 1.연락처 등록\n>> 2.모든 연락처 출력\n>> 3.연락처 검색\n>> 4.연락처 삭제\n>> 5.연락처 수정\n>> 6.프로그램 종료");
		System.out.println("----------------------------");
	}
}
