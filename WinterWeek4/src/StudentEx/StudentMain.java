package StudentEx;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student("Kim", 22);
		student.setRollNo("0001");
		
		System.out.println("학생의 이름 : " + student.name);
		System.out.println("학생의 이름 : " + student.getRollNo());
		System.out.println("학생의 이름 : " + student.age);
		System.out.println("Student 객체가 생성되었습니다.");
	}

}
