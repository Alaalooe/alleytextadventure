
public class BankAccount {
	private String number;
	private double balance;
	private String customerName;
	private String customerEmail;
	private String customerPhoneNum;
	
	public BankAccount(String number, double balance, String customerName,
			String customerEmail, String customerPhoneNum)
	{
		System.out.println("Constructor call");
		
		this.number = number;
		this.balance = balance;
		this.customerEmail = customerEmail;
		this.customerPhoneNum = customerPhoneNum;
		this.customerName = customerName;
	}
	
	public BankAccount(double balance)
	{
		this.balance = balance;
	}
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPhoneNum() {
		return customerPhoneNum;
	}
	public void setCustomerPhoneNum(String customerPhoneNum) {
		this.customerPhoneNum = customerPhoneNum;
	}
	public void deposit (double depositAmount)
	{
		balance +=depositAmount;
		System.out.println("Deposit of " + depositAmount + " made.");
	}
	public void withdraw (double withdrawAmount)
	{
		if (withdrawAmount>balance)
		{
			System.out.println("Only " + balance + 
					" available. Withdrawal not processed.");
		}
		else
		{
			balance -= withdrawAmount;
			System.out.println("Withdrawal of " + withdrawAmount +
					" processed. Remaining balance = " + balance + ".");
		}
		
	}
	
	
	
}
