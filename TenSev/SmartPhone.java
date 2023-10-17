package TenSev;

import java.util.Scanner;


public class SmartPhone {

	Scanner sc = new Scanner(System.in);
	Addr[] addr = new Addr[10];
	int numOfCount=0;

	Addr data()		{

			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("전화번호 : ");
			String no = sc.nextLine();

			System.out.print("이메일 : ");
			String mail = sc.nextLine();

			System.out.print("주소 : ");
			String address = sc.nextLine();
	
			System.out.print("그룹(친구/가족) : ");
			String group = sc.nextLine();
			
			return new Addr(name, no,mail,address, group);
		
		
	}
	//연락처 저장
	void save()		{
//		addr[numOfCount] = addrs;
		numOfCount++;										// !
		System.out.println(">>>데이터가 저장되었습니다. (" + numOfCount +")");		// !
	}
	//연락처 출력
	void print(Addr addr2)	{
		System.out.println("----------------------------------");
		System.out.println("이름 : " + addr[numOfCount].getName());
		System.out.println("전화번호 : " + addr[numOfCount].getNo());
		System.out.println("이메일 : " + addr[numOfCount].getMail());
		System.out.println("주소 : " + addr[numOfCount].getAddress());
		System.out.println("그룹 : " + addr[numOfCount].getGroup());
		System.out.println("----------------------------------\n");
	}
	// 모든 연락처 출력
	void AllPrint()	{
		for(int i=0; i<numOfCount; i++)	{
			print(addr[i]);
		}
	}
	//연락처 검색
	void search()		{
		System.out.print("검색하고자 하는 이름을 입력해주세요 : ");
		String findName = sc.nextLine();
		for(int i=0; i<numOfCount; i++)	{
			Addr addrs = addr[i];										// !
			if(addrs.getName() == findName)	{
				print(addrs);
			}else 
				System.out.println("검색 결과가 없습니다.");
		}
	}
	// 연락처 삭제
	void delete()		{
		System.out.print("삭제하고자 하는 이름을 입력해주세요 : ");
		String delName = sc.nextLine();
		for(int i=0; i<numOfCount; i++)	{
			Addr addrs = addr[i];										// !
			if(addrs.getName() ==delName)	{
				
			}else 
				System.out.println("검색 결과가 없습니다.");
		}
	}
	// 연락처 수정
	void modify()	{
		
	}
}

















