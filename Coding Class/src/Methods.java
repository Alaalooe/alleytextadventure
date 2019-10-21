import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		/*System.out.println("Enter your year of birth");
		
		while (!scanner.hasNextInt())
		{
			System.out.println("Please enter a year");
			scanner.nextLine();
			
		}
			int year = scanner.nextInt();
			while (year <=1900 || year >=2019)
			{
				System.out.println ("You can't be that age");
			
			year = scanner.nextInt();
			}
			scanner.nextLine();
		
			System.out.println("Enter your name");
			String name = scanner.nextLine();
			System.out.println(name + " " + year);
		
		
		
			
			int count = 1;
			 int sum = 0;
			 
			do
			{System.out.println ("Enter a number");
			int input; 	
			while (!scanner.hasNextInt())
			{
				System.out.println("A number");
				scanner.nextLine();
				
			}
				input = scanner.nextInt();
				sum+=input;
				count++;
				System.out.println("sum = " + sum);
			}while (count <=10);
		
			
			*/
			
			
			
			
			
			
			boolean isPowerButtonPress=false;
			double batteryLevel;
			boolean criticalError=false;
			boolean ifHardwareCheckPass =true;
			String password;

			System.out.println("Enter y if computer should turn on");
			String powerButton = scanner.nextLine();
			char powerChar = powerButton.charAt(0);
			if (powerChar == 'y')
				isPowerButtonPress = true;
			
			
			if (isPowerButtonPress)
			{
				System.out.println("Enter batterly level");
				batteryLevel = scanner.nextDouble();
				scanner.nextLine();
				if (batteryLevel > 3)
				{
					System.out.println("Computer booting up");
					if (!criticalError && ifHardwareCheckPass)
					{
						password = scanner.nextLine();
						System.out.println("Display log in screen");
						if (password == "password1234")
						{
							System.out.println("Display desktop");
						}
						else
						{
							System.out.println("Log in attempt failed");
						}
					}
					else
					{
						System.out.println("Blue screen of death, please restart");
					}
				}
				else
				{
					System.out.println("Please charge computer");
				}
			}
	}

}
