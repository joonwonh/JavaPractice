package DiceEx;

public class Dice {
	private int value;

	public Dice() {
		value = 0;
	}

	public void roll()	{
		value = (int)Math.random()*6;
	}
	
	public int getValue() {
		return value;
	}

//	public void setValue(int value) {
//		this.value = value;
//	}


	
		
	}


