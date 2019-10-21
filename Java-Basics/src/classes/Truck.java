package classes;

public class Truck extends Vehicle
{
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManuel;
	
	private int currentGear;

	public Truck(String name, String size, int wheels, int doors, 
			int gears, boolean isManuel) 
	{
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManuel = isManuel;
		this.currentGear = 1;
	}

	public void changeGear(int currentGear) 
	{
		this.currentGear = currentGear;
		System.out.println("Car.changeGear(): Changed to " 
				+ this.currentGear + " gear.");
	}
	
	public void changeSpeed(int speed, int direction)
	{
		System.out.println("Car.changeSpeed(): Speed " + speed 
				+ " direction " + direction);
		move(speed, direction);
	}
	
}
