package loopsAndLogic;

public class E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean gameOver = true;
		int score = 5000;
		int levelCompleted = 5;
		int bonus = 100;
		
		if (gameOver) //note this is a different way to
					//say something is true
		{
			int finalScore = score + (levelCompleted*bonus);
			System.out.println("Your final score was " + finalScore);
		}
		
		/*Print out a second score on the screen with the following
		 * score set to 10000
		 * levelCompleted set to 8
		 * bonus set to 200
		 * Make sure the first printout displays as well*/
		
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		if (gameOver)
		{
			int finalScore = score + (levelCompleted*bonus);
			System.out.println("Your final score was " + finalScore);
		}

	}

}
