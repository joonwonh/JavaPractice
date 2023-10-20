package InterfaceExample4;

public class MazingerToy implements Toy,MoveArmLeg,Misile {

	@Override
	public void toyType() {
		System.out.println("마징가입니다.");
	}

	@Override
	public void moveArmLeg() {
		System.out.println("팔다리를 움직일 수 있습니다.");
	}

	@Override
	public void launchMisile() {
		System.out.println("미사일을 발사할 수 있습니다.");
	}
	@Override
	public void print() {
		toyType();
		moveArmLeg();
		launchMisile();
		System.out.println("************************************");
		
	}

}
