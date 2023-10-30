package RocketEx;

public class RocketMain {

	public static void main(String[] args) {
		Rocket rocket = new Rocket(0,0);
		for(int i=0; i<3; i++)	{
			rocket.moveUp();
		}
			System.out.println(rocket.toString());
	}

}
