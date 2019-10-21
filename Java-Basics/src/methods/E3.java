package methods;

import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean flag= true;
		double feet;
		double inches;
		double centimeters;
		String stopStr;
		char stopChr;
		
		while(flag)
		{
			System.out.println("Enter a value for it to be converted into centimeters"
					+"\nEnter a value of feet");
			feet = scanner.nextDouble();
			scanner.nextLine();
			System.out.println("Enter a value of inches");
			inches=scanner.nextDouble();
			scanner.nextLine();
			centimeters = convertFtandIntoCen(feet, inches);
			System.out.println(feet + " feet, " + inches + " inches = " 
					+ centimeters + " centimeters"
					+ "\nEnter x to terminate the program");
			stopStr = scanner.next();
			stopChr = stopStr.charAt(0);
			if (stopChr == 'x')
				flag = false;
		}

	}
	
	public static double convertFtandIntoCen(double feet, double inches)
	{
		if (feet<0||inches<0||inches>12)
		{
			System.out.println("Invalid feet or inches parameters");
			return -1;
		}
		
		double centimeters = (feet*12*2.54)+(inches*2.54);
		return centimeters;
	}
	
	public static double convertFtandIntoCen(double inches)
	{
		if (inches<=0)
		{
			System.out.println("Invalid feet or inches parameters");
			return -1;
		}
		
		double centimeters = inches*2.54;
		return centimeters;
	}

}
