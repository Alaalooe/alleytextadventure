package methods;

public class SpeedConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printConversion(1, toMilesPerHour(1));
		printConversion(-80, toMilesPerHour(-80));
		printConversion(25.42, toMilesPerHour(25.42));
		
	}
	
	public static double toMilesPerHour(double kph)
	{
		if (kph <0)
			return -1;
		double mph = kph*0.621371;
		mph=Math.round(mph);
		
		return mph;
		
	}
	
	public static void printConversion(double kph, double mph)
	{
		System.out.println(kph+ " km/h = " + mph + " mi/h");
	}

}
