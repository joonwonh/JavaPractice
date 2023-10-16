package TenSix;

public class Student {

	private int kor;
	private int eng;
	private int math;
	
	int getKor()	{
		return kor;
	}
	void setKor(int kor)	{
		this.kor = kor;
	}
	int getEng()	{
		return eng;
	}
	void setEng(int eng)	{
		this.eng = eng;
	}
	int getMath()	{
		return math;
	}
	void setMath(int math)	{
		this.math = math;
	}
	public Student(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	int totalScore()	{
		return kor + eng + math;
	}
	int average()	{
		return (kor + eng + math)/3;
	}
	
}
