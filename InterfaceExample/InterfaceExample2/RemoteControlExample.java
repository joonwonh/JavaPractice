package InterfaceExample2;

public class RemoteControlExample {

	public static void main(String[] args) {

		RemoteControl rct = new Television();
		
		rct.setMute(true);
		rct.turnOn();
		rct.turnOff();
		System.out.println("======================");
		
		RemoteControl rca = new Audio();
		rca.setMute(true);
		rca.turnOn();
		rca.turnOff();
	}

}
