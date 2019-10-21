package classes;

public class Cat extends Animal
{

	private int tail;
	private int claws;
	private String coat;
	private int paws;
	private int whiskers;
	
	public Cat()
	{
		super("Name", 3, 4, 4);
	}
	public Cat(String name, int size, int weight, int tail, int claws,
			String coat, int paws, int whiskers) 
	{
		super(name, size, weight, 4);
		this.tail = tail;
		this.claws = claws;
	}
	
	public void eat()
	{
		System.out.println("Cat eat method called");
	}
	public void chew()
	{
		System.out.println("Cat chew method called");
		super.eat();
	}
	
	public void walk()
	{
		System.out.println("Cat walk method called");
		move(5);
	}
	public void run()
	{
		System.out.println("Cat run method called");
		move(10);
	}
	

}
