package loopsAndLogic;

public class E5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 4;
		int finishNumber = 20;


		//This program determines whether a number is even or not.
		while (number <= finishNumber)
		{
			number++;
			if ((number%2) == 0)
			{
				System.out.println("Even number " + number);
			}
		}
		
		
	}

}
