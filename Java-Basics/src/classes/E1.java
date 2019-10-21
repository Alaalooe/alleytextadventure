package classes;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		
		BankAccount bankAccount = new BankAccount();
		Scanner scanner = new Scanner(System.in);
		
		bankAccount.setNumber("123456789");
		bankAccount.setBalance(1000);
		bankAccount.setCustomerName("Gi");
		bankAccount.setCustomerEmail("giwest@gmail.com");
		bankAccount.setCustomerPhoneNum("1234567890");
		
		bankAccount.deposit(200);
		bankAccount.withdraw(400);
		bankAccount.withdraw(1000);

	}

}
