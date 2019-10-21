package classes;

public class F150 extends Truck
{
	private int payloadLimit;

	public F150(int payloadLimit) 
	{
		super("F150", "XL", 5, 4, 5, false);
		this.payloadLimit = payloadLimit;
	}
	
	public void accelerate(int rate)
	{
		int newSpeed = getCurrentSpeed() + rate;
		if (newSpeed ==0)
		{
			stop();
			changeGear(1);
		}
		else if (newSpeed >0 && newSpeed <=10)
		{
			changeGear(1);
		}
		else if (newSpeed > 10 && newSpeed <=20)
		{
			changeGear(2);
		}
		else if (newSpeed > 20 && newSpeed <=30)
		{
			changeGear(3);
		}
		else
		{
			changeGear(4);
		}
		
		if (newSpeed > 0)
		{
			changeSpeed(newSpeed, getCurrentDirection());
		}
		
	}
	
	
}
