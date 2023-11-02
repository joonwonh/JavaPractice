package AddressMangementArrayList;

public class Address {
	private String name;
	private String phoneNo;
	private String mail;
	private String address;       
	private String group;
	
	public Address(String name, String phoneNo, String mail, String address, String group)	{
		this.name = name;
		this.phoneNo = phoneNo;
		this.address = address;
		this.mail = mail;
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}
}
