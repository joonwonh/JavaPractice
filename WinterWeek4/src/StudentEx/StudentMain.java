package StudentEx;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student("Kim", 22);
		student.setRollNo("0001");
		
		System.out.println("�л��� �̸� : " + student.name);
		System.out.println("�л��� �̸� : " + student.getRollNo());
		System.out.println("�л��� �̸� : " + student.age);
		System.out.println("Student ��ü�� �����Ǿ����ϴ�.");
	}

}
