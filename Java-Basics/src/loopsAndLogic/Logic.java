package loopsAndLogic;

public class Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Basic if statement
		
		boolean gameOver = true;
		int score = 5000;
		int levelCompleted = 5;
		int bonus = 100;
		
		if (score == 4000)
			System.out.println("Your score was 4000");
		
		//System.out.println("This is not in the statement");
		
		else if (score == 5000)
			System.out.println("Your score was 5000");
		
		
		if (score >= 5000)
			System.out.println("Score greater than/equal to 5000");
		else if (score <10000)
			System.out.println("Score less than 10000");
		else
			System.out.println("Else statement");
		
		
		if (gameOver == true)
		{
			System.out.println("gameOver = true");
			System.out.println("Two statements at once");
		}
		
		
		
		
		
		int num = 13;
		if (num > 5 && num < 10)
			System.out.println("Between 5 and 10");
		if (num > 10 && num < 15)
			System.out.println("Between 10 and 15");
		if (num > 15 && num < 20)
			System.out.println("Between 15 and 20");
		
		
	}

}
