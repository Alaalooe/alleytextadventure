package loopsAndLogic;

public class E4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int primeCount = 0;
		boolean isPrime = false;
		
		for(int n = 1; n<100; n++)
		{
			if (n ==1)
			{
				isPrime = false;
				continue;
			}
			for(int i =2; i <=n/2;i++)
			{
				if(n%i==0) {
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
				primeCount++;
				System.out.println(n);
				if(primeCount ==10)
				{
					System.out.println("Exiting for loop");
					break;
				}
			}
		}
		
	}

}
