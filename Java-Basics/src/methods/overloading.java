package methods;

public class overloading {

	public static void main(String[] args) {
		
		int newScore = calculateScore("Gi", 500);
		System.out.println("New score is " + newScore);
		
		newScore =calculateScore(75);
		System.out.println("New score is " + newScore);
	}
	
	public static int calculateScore(String playerName, int score)
	{
		System.out.println("Player " + playerName + " scored " 
				+ score + " points");
		return score *1000;
	}
	
	public static int calculateScore(int score)
	{
		System.out.println("Unnamed player scored " 
				+ score + " points");
		return score * 1000;
	}
	
	public static void calculateScore()
	{
		
	}

}
