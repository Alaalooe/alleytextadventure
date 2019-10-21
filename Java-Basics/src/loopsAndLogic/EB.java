package loopsAndLogic;

public class EB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Create a new switch statement using char instead of int
		 * Create a char variable
		 * Create a switch statement and test for
		 * A, B, C, D, or E
		 * Display a message if any of these are found and then break
		 * Add a default which displays a message saying not found*/
		
		
		char testChar = 'D';
		
		switch(testChar)
		{
		case 'A':
			System.out.println("It's an A");
			break;
		case 'B':
			System.out.println("It's a B");
			break;
		case 'C':
			System.out.println("It's a C");
			break;
		case 'D':
			System.out.println("It's a D");
			break;
		case 'E':
			System.out.println("It's an E");
			break;
		default:
			System.out.println("It's not an A, B, C, D, or E");
			break;
		}
	}

}
