package InterfaceExample4;

public class MainClass {

	public static void main(String[] args) {
		
		Toy toy;
		
		toy = new BearToy();
		toy.print();
		toy = new MazingerToy();
		toy.print();
		toy = new AirPlaneToy();
		toy.print();
	}

}
