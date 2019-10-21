package methods;

import java.util.Scanner;

public class ReadingInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your year of birth: ");
		
		boolean hasNextInt = scanner.hasNextInt();
		if (hasNextInt)
		{
			int year = scanner.nextInt();
			
			while (year <1900 || year >2019)
			{
				System.out.println("Invalid year, enter a new year: ");
				year = scanner.nextInt();
			}
			
			scanner.nextLine();
			
			System.out.println("Enter your name: ");
			String name = scanner.nextLine();
			
			System.out.println("Your name is "+name+ ", and you were born in "+year);
		}
		else
		{
			System.out.println("Unable to parse year of birth");
		}
		
		scanner.close();

	}

}
