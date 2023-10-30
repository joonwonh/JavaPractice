package ArrangeEx;

import java.util.Random;

public class ArrangementMain {

	public static void main(String[] args) {

		Random random = new Random();
		int [][] arr2 = new int[3][4];
		int sum=0;
		
		for(int i=0; i<3; i++)	{
			for(int j=0; j<4; j++)	{
				int a = random.nextInt(10);
				arr2[i][j] = a;
				sum += a;
				System.out.print(a + "  ");
			}
			System.out.println();
		}
		System.out.println("гую╨ " + sum);
		
	}

}
