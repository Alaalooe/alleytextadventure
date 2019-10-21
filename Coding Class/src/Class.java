
public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player john = new Player();
		john.name = "John";
		
		Car prius = new Car();
		prius.setColor("Blue");
		System.out.println(prius.getColor());
		
		
		BankAccount bank = new BankAccount("12355439", 1000, "Gi",
				"gpwest@mtu.edu", "1234567890");
		
		System.out.println(bank.getNumber());
		
		BankAccount bank2 = new BankAccount(1000);
		System.out.println(bank2.getBalance());
		
		
		
	}

}
