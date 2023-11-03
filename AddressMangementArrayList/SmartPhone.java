package AddressMangementArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SmartPhone {
	Scanner sc = new Scanner(System.in);
	Map<String, Address>addr = new HashMap<>();
	
	public Address inputAddress()	{
		
		while(true)	{
			System.out.print("전화번호 : ");
			String phoneNo = sc.nextLine();
			boolean result = addr.containsKey(phoneNo);
			if(result == true)	{
				System.out.println("중복된 전화번호입니다.");
				break;
			}
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("ID : ");
			String id = sc.nextLine();
			
			System.out.print("주소 : ");
			String address = sc.nextLine();
			
			System.out.print("그룹 : ");
			String group = sc.nextLine();
			System.out.println("저장이 완료되었습니다.");
			return addr.put(phoneNo, new Address(name, id, address, group));
	}
		return null;
	}
	
	public void printAddress(Address data)	{
		System.out.println("이름 : " + data.getName());
		System.out.println("ID : " + data.getId());
		System.out.println("주소 : " + data.getAddress());
		System.out.println("그룹 : " + data.getGroup());
		System.out.println("--------------------------------");
		
		}
	
	public void printAllAddress()	{
		Set<String>keySet = addr.keySet();
		Iterator<String>keyIterator = keySet.iterator();
		while(keyIterator.hasNext())		{
			String key = keyIterator.next();
			Address value = addr.get(key);
			System.out.println("전화번호 : " + key);
			printAddress(value);
		}
	}
	
	public void searchAddressV(String phoneNo)	{
		boolean result = addr.containsKey(phoneNo);
		if(result == true)	{
		Address value = addr.get(phoneNo);
		printAddress(value);
			}
		else	{
			System.out.println("연락처가 존재하지 않습니다.");
		}
	}

	public void deleteAddress(String phoneNo)	{
		boolean result = addr.containsKey(phoneNo);
		if(result == true)	{
			addr.remove(phoneNo);
			System.out.println("삭제가 완료되었습니다.");
		}
		else	{
			System.out.println("연락처가 존재하지 않습니다.");
		}
	}
	
	public void modifyAddress(String phoneNo)	{
		boolean result = addr.containsKey(phoneNo);
		if(result == true)	{
			addr.remove(phoneNo);
			inputAddress();
			System.out.println("수정이 완료되었습니다.");
		}
		else	{
			System.out.println("연락처가 존재하지 않습니다.");
		}
	}
	public void printMenu() {
		System.out.println();
		System.out.println("								--------------------------------");
		System.out.println("								|							|");
		System.out.println("								|	주소록을 관리 해보자!	|");
		System.out.println("								|							|");
		System.out.println("								--------------------------------");
		System.out.println("					---------------------------------------------------------");
		System.out.println("					ㅣ 		   		1. 연락처 등록					ㅣ");
		System.out.println("					ㅣ 		   		2. 모든 연락처 출력				ㅣ");
		System.out.println("					ㅣ 		   		3. 연락처 검색					ㅣ");
		System.out.println("					ㅣ 		   		4. 연락처 삭제					ㅣ");
		System.out.println("					ㅣ 		   		5. 연락처 수정					ㅣ");
		System.out.println("					ㅣ 		   		6. 프로그램 종료					ㅣ");
		System.out.println("					---------------------------------------------------------");
		System.out.println();
	}

}
