package loopsAndLogic;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		while(count != 5)
		{
			System.out.println("Count value is " + count);
			count++;
		}
		
		System.out.println();
		
		count = 1;
		while(true)
		{
			if (count ==6)
				break;
			
			System.out.println("Count value is " + count);
			count++;
		}
		
		System.out.println();
		
		count = 1;
		do
		{
			System.out.println("Count value was " + count);
			count++;
		} while (count !=6);
		
	}

}
