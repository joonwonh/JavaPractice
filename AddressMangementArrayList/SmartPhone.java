package AddressMangementArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmartPhone {
	Scanner sc = new Scanner(System.in);
	List<Address> addr = new ArrayList<>(10);
	
	public Address inputAddress()	{
		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("전화번호 : ");
		String phoneNo = sc.nextLine();
		
		System.out.print("메일 : ");
		String mail = sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("그룹 : ");
		String group = sc.nextLine();
		
		
		return new Address(name, phoneNo, mail, address, group);
	}
	
	public void saveAddress(Address inputAddress)	{
		addr.add(inputAddress);
		System.out.println("데이터가 저장되었습니다. (" + addr.size() + ")");
	}
	
	public void printAddress(Address data)	{
		System.out.println("이름 : " + data.getName());
		System.out.println("전화번호 : " + data.getPhoneNo());
		System.out.println("메일 : " + data.getMail());
		System.out.println("주소 : " + data.getAddress());
		System.out.println("그룹 : " + data.getGroup());
		System.out.println("--------------------------------");
		
	}
	
	public void printAllAddress()	{
		for(int i=0; i<addr.size(); i++)	{
			printAddress(addr.get(i));
		}
	}
	
	public void searchAddress(String name)	{
		for(int i=0; i<addr.size(); i++) {
			if(addr.get(i).getName().equals(name))	{
				printAddress(addr.get(i));
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
	}

	public void deleteAddress(String name)	{
		for(int i=0; i<addr.size(); i++)	{
			if(addr.get(i).getName().equals(name))		{
				addr.remove(i);
				System.out.println("삭제되었습니다.");
				return;
			}
		}
		System.out.println("다시 입력하세요.");
	}
	
	public void modifyAddress(String name, Address inputAddr)	{
		for(int i=0; i<addr.size(); i++)	{
			if(addr.get(i).getName().equals(name))		{
					addr.set(i, inputAddr);
					System.out.println("수정되었습니다.");
			}
		}
	}
	public void printMenu() {
		System.out.println("--------------------------------");
		System.out.println("1. 연락처 등록");
		System.out.println("2. 모든 연락처 출력");
		System.out.println("3. 연락처 검색");
		System.out.println("4. 연락처 삭제");
		System.out.println("5. 연락처 수정");
		System.out.println("6. 프로그램 종료");
		System.out.println("--------------------------------");		
	}

}
