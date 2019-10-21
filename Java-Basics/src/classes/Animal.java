package classes;

public class Animal {

	private String name;
	private int size;
	private int weight;
	private int limbs;
	
	public Animal(String name, int size, int weight, int limbs)
	{
		this.name= name;
		this.size = size;
		this.weight= weight;
		this.limbs=limbs;
	}
	
	public void eat()
	{
		System.out.println("Animal eat method called");
	}
	public void move(int speed)
	{
		System.out.println("Animal is moving at " +speed);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getLimbs() {
		return limbs;
	}
	public void setLimbs(int limbs) {
		this.limbs = limbs;
	}
	
}
