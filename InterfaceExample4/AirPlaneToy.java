package InterfaceExample4;

public class AirPlaneToy implements Toy,Light,Misile {

	@Override
	public void launchMisile() {
		System.out.println("미사일 발사가 가능합니다.");
	}

	@Override
	public void launchLight() {
		System.out.println("불빛 발사가 가능합니다.");
	}

	@Override
	public void toyType() {
		System.out.println("비행기입니다.");
	}

	@Override
	public void print() {
		toyType();
		launchLight();
		launchMisile();
		System.out.println("************************************");
	}

}
