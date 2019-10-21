package loopsAndLogic;

public class Switch {

	public static void main(String[] args) {
		
		//one way to determine a value
		int value = 3;
		/*if (value ==1)
		{
			System.out.println("Value was 1");
		}
		else if (value ==2)
		{
			System.out.println("Value was 2");
		}
		else
		{
			System.out.println("Value was not 1 or 2");
		}*/
		
		
		//a much more efficient way to determine a value
		
		switch(value) 
		{
		case 1:
			System.out.println("Value was 1");
			break;
		case 2:
			System.out.println("Value was 2");
			break;
		case 3: case 4: case 5:
			System.out.println("Value was 3, 4, or 5");
		default:
			System.out.println("Value was not 1 or 2");
			break;
			
		}

	}

}
