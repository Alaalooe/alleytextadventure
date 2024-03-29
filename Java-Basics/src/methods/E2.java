package methods;

public class E2 {

	public static void main(String[] args) {
		
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Gi", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition("Jenny", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("Bob", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(50);
		displayHighScorePosition("John", highScorePosition);
		
	}

	public static void displayHighScorePosition(String playerName, int highScorePosition)
	{
		System.out.println(playerName + " managed to get into position " 
				+ highScorePosition + " on the high score table");
		
	}
	
	public static int calculateHighScorePosition(int playerScore)
	{
		/*if (playerScore >= 1000)
		{
			return 1;
		}
		else if (playerScore>=500 )
		{
			return 2;
		}
		else if (playerScore >=100 )
		{
			return 3;
		}
		else
		{
			return 4;
		}*/
		
		int value;
		
		if (playerScore >= 1000)
		{
			value = 1;
		}
		else if (playerScore>=500 )
		{
			value = 2;
		}
		else if (playerScore >=100 )
		{
			value = 3;
		}
		else
		{
			value = 4;
		}
		return value;
	}
	
}
