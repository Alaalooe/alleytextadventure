package monsters;

public class Goblin extends Monster
{
	private int pointyEars;
	private int claws;
	
	
	
	public Goblin(int pointyEars, int claws) {
		super(5, 20, 2, 8);
		this.pointyEars = pointyEars;
		this.claws = claws;
	}



	public void pickPocket()
	{
		
	}
}
