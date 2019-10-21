package classes;

public class Dog extends Animal
{

	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String fur;
	
	public Dog(String name, int size, int weight, int eyes, 
			int legs, int tail, int teeth, String fur) 
	{
		super(name, size, weight, 4);
		this.eyes = eyes;
		this.legs = legs;
		this.tail=tail;
		this.teeth = teeth;
		this.fur = fur;
	}
	
	
	public void chew()
	{
		System.out.println("Chew called");
	}
	
	public void eat()
	{
		System.out.println("Dog eat method called");
		chew();
		super.eat();
	}
	
	public void walk()
	{
		System.out.println("Dog walk method called");
		move(5);
	}
	public void run()
	{
		System.out.println("Dog run method called");
		move(10);
	}

}
