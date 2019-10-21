
public class ComputerMain {

	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(20,20,5);
		Case theCase = new Case ("2200", "Dell", "240", dimensions);
		
		Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, 
				new Resolution(2540, 1400));
		
		Motherboard theMotherboard = new Motherboard("83-200", "Asus", 
				4,6,"v2.44");
		
		PC thePC = new PC(theCase, theMonitor, theMotherboard);

	}

}
