package InterfaceExample3;

public class MainClass {

	public static void main(String[] args) {

		IFunction ifc;
		ifc = new APhone();
		ifc.print();
		ifc = new BPhone();
		ifc.print();
		ifc = new Cphone();
		ifc.print();
		
		
		
	}

}
