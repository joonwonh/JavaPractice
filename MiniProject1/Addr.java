package MiniProject1;

public class Addr {

	private String name;
	private String no;
	private String mail;
	private String address;
	private String group;

	// 생성자
	public Addr(String name, String no, String mail, String address, String group) {
		this.name = name;
		this.no = no;
		this.mail = mail;
		this.address = address;
		this.group = group;
	}
	
	public String getName()	{
		return name;
	}
	void setName(String name)	{
		this.name = name;
	}
	
	String getNo()	{
		return no;
	}
	void setNo(String no)	{
		this.no = no;
	}
	
	String getMail()	{
		return mail;
	}
	void setMail(String mail)	{
		this.mail = mail;
	}
	
	String getAddress()	{
		return address;
	}
	void setAddress(String address)	{
		this.address = address;
	}
	
	String getGroup()	{
		return group;
	}
	void setGroup(String group)	{
		this.group = group;
		
	}
	 void printInfo()		{
		 System.out.println("이름 : " + name);
		 System.out.println("전화번호 : " + no);
		 System.out.println("이메일 : " + mail);
		 System.out.println("주소 : " + address);
		 System.out.println("그룹 : " + group);
	}
}
