package InterfaceExample3;

public class APhone implements IFunction {

	@Override
	public void func() {
		System.out.println("Aphone");
	}

	@Override
	public void canCall() {
		System.out.println("전화 가능합니다");
	}

	@Override
	public void connectSpeed() {
		System.out.println("불가능 합니다. 3G입니다");
	}

	@Override
	public void tvRemoteFunc() {
		System.out.println("미 탑재 되어있습니다.");
	}

	@Override
	public void print() {
		func();
		canCall();
		connectSpeed();
		tvRemoteFunc();
		System.out.println("----------------");
	}


}
