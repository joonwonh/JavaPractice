package MiniProject1;

import java.util.Scanner;


public class SmartPhone {
	
	Scanner sc = new Scanner(System.in);
	Addr[] addrs = new Addr[10];
	int numOfCount=0;

	Addr inputData()		{
			
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
	
	// 배열에 연락처 객체 저장
	void addAddr(Addr addr)		{
		addrs[numOfCount] = addr;
		numOfCount++;
		System.out.println(">>>데이터가 저장되었습니다. (" + numOfCount +")");
	}
	// 연락처 출력
	void printAddr(Addr addr)	{
		System.out.println("-------------------------------------");
		System.out.println("이름 : " + addr.getName());
		System.out.println("전화번호 : " + addr.getNo());
		System.out.println("이메일 : " + addr.getMail());
		System.out.println("주소 : " + addr.getAddress());
		System.out.println("그룹 : " + addr.getGroup());
		System.out.println("-------------------------------------\n");
	}
	// 모든 연락처 출력
	void printAllAddr()	{
		for(int i=0; i<numOfCount; i++)
			printAddr(addrs[i]);
	}
	//연락처 검색
	void searchAddr(String name)		{
		for(int i=0; i<numOfCount; i++)	{
			Addr addr = addrs[i];
			if(addr.getName().contentEquals(name))	{
				printAddr(addr);
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
		
	}
	//연락처 삭제
	void deleteAddr(String name)		{
		for(int i=0; i<numOfCount; i++)	{
			Addr addr = addrs[i];
			if(addr.getName().contentEquals(name))	{
				for(int j=i; j<numOfCount; j++ )	{
					addrs[j] = addrs[j+1];
				}
				numOfCount--;
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
	}
	//연락처 수정
	void editAddr(String name, Addr newContact)	{
		for(int i=0; i<numOfCount; i++)	{
			if(addrs[i].getName().contentEquals(name))	{
				addrs[i] = newContact;
				return;
			}
		}
		
	}
}
