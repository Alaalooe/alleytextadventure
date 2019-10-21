import java.util.Scanner;

public class Methods2 {

	static Scanner scanner = new Scanner(System.in);
	static boolean criticalError=false;
	static boolean ifHardwareCheckPass =true;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		if(gameOver)
		{
			int finalScore = score +(levelCompleted*bonus);
			System.out.println("Your final score was " + finalScore);
		}
		
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		if(gameOver)
		{
			int finalScore = score +(levelCompleted*bonus);
			System.out.println("Your final score was " + finalScore);
		}
		
		calculateScore(true, 800, 5, 100);
		System.out.println("Done with method");
		calculateScore(true, 10000, 8, 200);
		
		int finalScore = calculateScoreInt(true, 800, 5, 100);
		if (finalScore == -1)
			System.out.println("Game over not true");
		else
			printScore(finalScore);
		
		int score = 1000000000;
		if (score >= 1000000000)
		{
			finalScore = calculateScoreInt(true,score);
			printScore(finalScore);
		}*/
			
			
		
		
		
		
		
		
		String password;

		
		powerButton();
		
		
		
		
		
		/*if (isPowerButtonPress)
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
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public static void powerButton()
	{
		
		boolean isPowerButtonPress=false;
		System.out.println("Enter y if computer should turn on");
		String powerButton = scanner.nextLine();
		char powerChar = powerButton.charAt(0);
		if (powerChar == 'y')
		{
			isPowerButtonPress = true;
			bios(isPowerButtonPress);
		}
	}
	
	public static void bios(boolean isPowerButtonPress)
	{
		double batteryLevel;
		System.out.println("Enter battery level");
		batteryLevel = scanner.nextDouble();

		if (batteryLevel > 3)
		{
			System.out.println("Computer booting up");
			if (!criticalError && ifHardwareCheckPass)
			{
				
				logInScreen();
			}
			
		}
	}
	
	
	public static void logInScreen()
	{
		scanner.nextLine();
		System.out.println("Please enter your password");
		String password = scanner.nextLine();
		if (password == "password1234")
		{
			displayDesktop();
			
		}
		else
		{
			System.out.println("Log in attempt failed");
		}
	}
	
	public static void displayDesktop()
	{
	System.out.println("Welcome to your desktop, press i to go to the internet");	
	}
	
	
	//create methods on a car, refrigerator, plant
	
	
	int checkTemperature(int sensorValue)
	{
		return 0;
	}
	boolean isDoorOpen(int doorSensor)
	{
		return false;
	}
	//int temperature = checkTemperature(2)
	//coolFridge(temperature);
	void coolFridge(int temperature, int setTemp)
	{
		int compressorPower = 10;
		while (temperature > setTemp)
		{
			int compressorTemp = runCompressor(compressorPower);
			temperature = checkTemperature(2);
			if (compressorTemp> 90)
			{
				compressorPower = 2;
			}
		}
		
	}
	int runCompressor(int powerLevel)
	{
		return 0; //compressor temp
	}
	
	
	
	
	
	
	public static void calculateScore(boolean gameOver, int score, 
			int levelCompleted, int bonus)
	{
		if(gameOver)
		{
			int finalScore = score +(levelCompleted*bonus);
			System.out.println("Your final score was " + finalScore);
		}
	}
	
	
	public static int calculateScoreInt(boolean gameOver, int score, 
			int levelCompleted, int bonus)
	{
		if(gameOver)
		{
			int finalScore = score +(levelCompleted*bonus);
			return finalScore;
		}
		else
		{
			return -1;
		}

	}
	
	public static int calculateScoreInt(boolean gameOver, int score)
	{
		if (gameOver)
		{
			int finalScore = score +60;
			return finalScore;
		}
		else
		{
			return -1;
		}
	}
	
	
	public static void printScore(int finalScore)
	{
		System.out.println("Your final score was " + finalScore);
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void attack(int strength)
	{
		
	}
	public static void attack(String weapon, int sharpness)
	{
		
	}
	public static void attack(int range, String spell, int powerLevel)
	{
		
	}
	
	
	public static void armMove()
	{
		
	}
	public static void move(int degrees, int speed)
	{
		//turn wheels a certain way based on degrees
		//supply power to the motors based on speed
	}
	public static void move(int c)
	{
		switch(c)
		{
		case 1: //turn left
			break;
		case 2: //go straight
			break;
		case 3: //turn right
			break;
		case 4: //turn around
			break;
		default: //stop
			break;
		}
	}
	
	

	
	
	
	
	

}
