package loopsAndLogic;

public class E3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double amount = 10000.0;
		
		for(double interestRate=2.0; interestRate<9;interestRate++)
		{
			double interest = amount*(interestRate/100);
			System.out.println("10000 at " + interestRate+"% interest = " 
					+ String.format("%.2f", interest));
		}
		
		
	}

}
