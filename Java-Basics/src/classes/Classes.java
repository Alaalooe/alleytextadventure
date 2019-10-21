package classes;

public class Classes {

	public static void main(String[] args) {
		
		Car porsche = new Car();

		porsche.setModel("Carrera");
		
		System.out.println("Model is " + porsche.getModel());
		
		Car ford = new Car(5, 4, "Fiesta", "V8", "Red");

	}

}
