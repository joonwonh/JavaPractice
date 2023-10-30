package RocketEx;

public class Rocket {
	public int x;
	public int y;

	public Rocket(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Rocket [x=" + x + ", y=" + y + "]";
	}
	public void moveUp()	{
		this.y++;
	}
	
}
