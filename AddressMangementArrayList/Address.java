package AddressMangementArrayList;


public class Address {
	private String name;
	private String phoneNo;
	private String id;
	private String address;       
	private String group;
	
	public Address(String name, String id, String address, String group)	{
		this.name = name;
		this.address = address;
		this.id = id;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Address)	{
			Address address = (Address)obj;
			return (phoneNo == address.phoneNo);
		}else
			return false;
	}
	@Override
	public int hashCode() {
		return phoneNo.hashCode();
	}
}
