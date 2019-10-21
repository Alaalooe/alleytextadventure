package methods;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int count = 1;
		int sum = 0;
		int num;
		
		do
		{
			System.out.println("Enter number " + count);
			boolean hasNextInt = scanner.hasNextInt();
			while(!hasNextInt)
			{
				scanner.nextLine();
				System.out.println("Invalid number, enter a different number");
				hasNextInt = scanner.hasNextInt();
			}
			
			num = scanner.nextInt();
			sum += num;
			count++;
			
		}while (count <=10);
		
		System.out.println("Sum was " + sum);
		
	}

}
