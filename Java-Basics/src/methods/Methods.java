package methods;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calculateScore();
		
		calculateScoreParameters(true, 800, 5, 100);
		calculateScoreParameters(true, 10000, 8, 200);
		
		
		int highScore = calcuateScoreInt(true, 800, 5, 100);
		System.out.println("Your high score was " +highScore);
		
		
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		if(gameOver)
		{
			int finalScore = score +(levelCompleted*bonus);
			System.out.println("Your final score was " + finalScore);
		}
		
		score = 10000;
		levelCompleted= 8;
		bonus = 200;
		
		if(gameOver)
		{
			int finalScore = score +(levelCompleted*bonus);
			System.out.println("Your final score was " + finalScore);
		}
		
	}

	
	
	
	public static void calculateScore()
	{
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		if (gameOver)
		{
			int finalScore = score + (levelCompleted*bonus);
			finalScore +=1000;
			System.out.println("Your final score was " +finalScore);
		}
	}
	
	
	
	public static void calculateScoreParameters(boolean gameOver, int score, 
			int levelCompleted, int bonus)
	{
		if (gameOver)
		{
			int finalScore = score + (levelCompleted*bonus);
			finalScore +=1000;
			System.out.println("Your final score was " +finalScore);
		}
	}
	
	
	
	public static int calcuateScoreInt(boolean gameOver, int score, 
			int levelCompleted, int bonus)
	{
		if (gameOver)
		{
			int finalScore = score + (levelCompleted*bonus);
			finalScore +=1000;
			return finalScore;
		}
		else
			return 0;
	}
	
}
