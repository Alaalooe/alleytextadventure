//Create main class
//able to access fields of class
//issue, you can change player health directly 
//	without needing to use the loseHealth method
//also if you change the name of variables, outside classes
//	may have errors


public class Player {

	public String name;
	public int health;
	public String weapon;
	
	public void loseHealth(int damage)
	{
		this.health = this.health - damage;
		
		if (this.health <=0)
			System.out.println("Player knocked out");
	}
	
	public int healthRemaining()
	{
		return this.health;
	}
	
}
