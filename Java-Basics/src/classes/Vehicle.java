package classes;

public class Vehicle 
{
	private String name;
	private String size;
	
	private int currentDirection;
	private int currentSpeed;
	
	public int getCurrentDirection() {
		return currentDirection;
	}

	public void setCurrentDirection(int currentDirection) {
		this.currentDirection = currentDirection;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public Vehicle(String name, String size)
	{
		this.name = name;
		this.size = size;
		
		this.currentSpeed = 0;
		this.currentDirection=0;
	}
	
	public void steer(int direction)
	{
		this.currentDirection+=direction;
		System.out.println("Vehicle.steer(): Steering at " + currentDirection 
				+ " degrees.");
	}
	
	public void move(int speed, int direction)
	{
		currentSpeed = speed;
		currentDirection = direction;
		System.out.println("Vehicle.move(): Moving at " + currentSpeed 
				+ " in direction " + currentDirection);
		
	}
	
	public void stop()
	{
		currentSpeed = 0;
		System.out.println("Vehicle.stop(): Vehicle stopped");
	}
}
