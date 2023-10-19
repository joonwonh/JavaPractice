package InterfaceExample;

public class Mainclass {

	public static void main(String[] args) {

		InterfaceClass interfaceClass = new InterfaceClass();
		interfaceClass.getStr();
		interfaceClass.calculate();
		
		InterfaceEx ife =new InterfaceClass();
		ife.calculate();
		//ife.getStr();		error
		InterfaceEx2 ife2 = new InterfaceClass();
		ife2.getStr();
		// ife2.calculate();	error
	}

}
