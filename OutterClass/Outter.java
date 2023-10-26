package OutterClass;

public class Outter {

	String field = "Outter-field";
	void method()	{
		System.out.println("Outter-field");
	}
	
	class Nested	{
		String field = "Nested-field";
		void method()	{
			System.out.println("Nested-Method");
		}
		void print()	{
			System.out.println(this.field);
			this.method();
			System.out.println(Outter.this.field);	// Outter class에 있는 변수 field를 가리킴
			Outter.this.method();
		}
	}
}
