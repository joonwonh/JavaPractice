package DiceEx;

public class DiceMain {

	public static void main(String[] args) {
		Dice dice = new Dice();
		
		dice.roll();
		System.out.print("�ֻ��� 1 = " + dice.getValue());
		dice.roll();
		System.out.println("  �ֻ��� 2 = " + dice.getValue());
	}

}
