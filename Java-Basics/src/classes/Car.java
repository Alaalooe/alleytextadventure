package classes;

public class Car {

	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;
	
	public Car()
	{
		
	}
	
	public Car(int doors, int wheels, String model, String engine, String color)
	{
		this.doors =doors;
		this.wheels= wheels;
		this.model= model;
		this.engine= engine;
		this.color = color;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public String getModel()
	{
		return this.model;
	}
}
