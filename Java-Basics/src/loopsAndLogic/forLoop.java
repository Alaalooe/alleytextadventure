package loopsAndLogic;

public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int interest1;
		int interest2;
		int interest3;
		int interest4;
		int amount1 = 10000;
		int amount2 = 10000;
		int amount3 = 10000;
		int amount4 = 10000;
		int rate1=2;
		int rate2=3;
		int rate3=4;
		int rate4=5;
		
		interest1=amount1*rate1;
		interest2=amount2*rate2;
		interest3=amount3*rate3;
		interest4=amount4*rate4;
		
		System.out.println("Interest 1 = " + interest1
				+ " Interest 2 = " +interest2 + " Interest 3 = " + interest3
				+ " Interest 4 = " + interest4);*/
		
		
		//Basic structure of a for statement
		//for(int; termination condition; increment)
		
		
		for(int i =0; i<6;i=i+2)
		{
			System.out.println("i = "+i);
		}
		
		
		System.out.println();
		
		
		for(double c = 5; c>0; c=c-.5)
		{
			System.out.println("c = " +c);
		}

		
		System.out.println();
		
		
		for(int j=0; j<=100; j=j+10)
		{
			System.out.println("j = " +j);
			System.out.println("In j for loop");
		}
		
		System.out.println("here");
		System.out.println();
		System.out.println();
		
		
		//int ans = j+c;
		
		
		int test = 27;
		for(int i = 1; i<5;i++)
		{
			test = test +1;
			System.out.println("test = " + test);
		}
		System.out.println("test out of for loop = "+ test);
		
		
		
		
		/* Experiment
		for(int i =0; i<6;i++)
		{
			if (i==3)
			{
				System.out.println("end for loop");
				i=5;
			}
			System.out.println("i = " + i);
		}
		
		Outputs
		i = 0
		i = 1
		i = 2
		end for loop
	 	i = 5 */

		
		
	}

}
