package InterfaceExample4;

public class BearToy implements Toy,MoveArmLeg {

	@Override
	public void toyType() {
		System.out.println("곰돌이 입니다...");
	}
	@Override
	public void moveArmLeg() {
		System.out.println("팔다리를 움직일 수 있습니다.");
	}
	@Override
	public void print() {
		toyType();
		moveArmLeg();
		System.out.println("************************************");
	}
	
}
