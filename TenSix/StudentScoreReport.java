package TenSix;

public class StudentScoreReport {

	public static void main(String[] args) {
		
		Student[] student = new Student[10];
		student[0] = new Student(100,70,80);
		student[1] = new Student(70,80,60);
		student[2] = new Student(80,70,70);
		student[3] = new Student(60,80,80);
		student[4] = new Student(50,60,70);
		student[5] = new Student(70,50,60);
		student[6] = new Student(90,90,50);
		student[7] = new Student(90,80,90);
		student[8] = new Student(80,70,90);
		student[9] = new Student(100,80,90);
		
		System.out.println("### Score Report ###");
		System.out.println("국어 \t\t 영어 \t 수학 \t | \t 총합 \t 평균");
		System.out.println("----------------------------------------------------");
		
		for(int i=0; i<10; i++)	{
			System.out.println(student[i].getKor() + " \t\t " + student[i].getEng() + " \t\t " + student[i].getMath() +
					"\t\t |\t" + student[i].totalScore() + "\t\t" + student[i].average());
		}
	}
}
