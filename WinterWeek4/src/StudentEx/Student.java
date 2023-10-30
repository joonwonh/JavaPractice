package StudentEx;

public class Student {
	public String name;
	private String rollNo;
	public int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
}
