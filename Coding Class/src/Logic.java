
public class Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean gameOver = true;
		int score = 5000;
		int levelCompleted = 5;
		int bonus = 100;
		
		
		if (gameOver)
		{
			
		}
		
		
		
		if (score == 4000)
		{
			System.out.println("Your score was 4000");
			double finalScore = score*1.5;
			System.out.println(finalScore);
		}
		else if (score == 5000)
		{
			System.out.println("Your score was 5000");
			double finalScore = score * 2;
			System.out.println(finalScore);
		}
		else
			System.out.println("You score was " + score);
		
		
		
		if (score >=5000)
			System.out.println("Score greater than/equal to 5000");
		else if (score <10000)
			System.out.println("Score less than 10000");
		
		
		//&&
		
		if (score >=5000 && score <10000)
			System.out.println ("Score was greater or equal to 5000, but less than 10000");
		
		
		boolean isPowerButtonPress = true;
		double batteryLevel = .2;
		boolean criticalError = false;
		boolean ifHardwareCheckPass = false;
		String password = "password9876";
		
		
		if (isPowerButtonPress)
		{
			if (batteryLevel > 3)
			{
				System.out.println("Computer booting up");
				if (!criticalError && ifHardwareCheckPass)
				{
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
		
		
		
		int num = 3;
		
		if (num ==1)
		{
			
		}
		else if (num ==2)
		{
			
		}
		
		
		switch(num)
		{
		case 1:
			System.out.println("Num = " +1);
			break;
		case 2:
			System.out.println("Num = " +2);
			break;
		case 3:
			System.out.println("Num = " +3);
			break;
		default:
			System.out.println("Default");
			break;
		}
		 
		
		double j = 3.0;
		
		for(int i = 20; i>=15; i--)
		{
			System.out.println("i = " + i);
			for (  ; j <300; )
			{
				System.out.println("j = " + j);
				
				j = j*3;
			}
		}
		
		
		//System.out.println(j);
		
		
		int interest;
		int amount = 10000;
		int rate1 = 2;
		int rate2 = 3;
		int rate3 = 4;
		int rate4 = 5;
		for (int rate = 2;rate <=8  ; rate++)
		{
			interest= amount*rate;
			
			System.out.println("Interest = " + interest);		
		}
			
	
		
		
		
		
		boolean isPrime=false;
		for (int n = 1; n <=100; n++)
		{
			if (n > 1 )
			{
				for (int i =2; i <=n/2;i++)
				{
				if (n%i==0) {
				isPrime = false;
				break;
				}
				else 
				{
					isPrime = true; 
				}
				}
				

				if (isPrime)
				{
					System.out.println(n);
				}
			}
			
		}
		
		
		
		
		
		
		int number = 4;
		int finishNumber = 20;
		
		while (number < finishNumber)
		{
			if (number %2==0)
			{
				System.out.println(number + " is even");
			}
			
			number++;
			if (number== finishNumber)
			{
				number = 4;
			}
		}
		
		
		
		
		
	}

}
