package PersonEx;

public class Person {
	private String name;
	private String mobile;
	private long office;
	private String email;
	
	public Person(String name, String mobile, long office, String email) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.office = office;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public long getOffice() {
		return office;
	}

	public void setOffice(long office) {
		this.office = office;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + getName() + ", mobile=" + mobile + ", office=" + office + ", email=" + email + "]";
	}

	
	
}
