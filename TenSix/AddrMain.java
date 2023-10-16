package TenSix;

public class AddrMain {

	public static void main(String[] args) {

		Addr addr = new Addr("최윤호","010-0000-0000","choi@gmail.com", "서울", "친구");
		addr.printInfo();
		System.out.println("---------------------------");
		System.out.println("그룹 정보 변경");
		System.out.println("---------------------------");
		addr.setGroup("가족");	//그룹 정보 변경
		addr.printInfo();
		
	}

}
