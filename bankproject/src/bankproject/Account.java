package bankproject;

public class Account {
	private int accountNumber;  //Encapsulation purpose
	private String name;
	private float balance;
	static private String bankname="AXIS Bank";
	final float MINIMUM_Balance=1000;
	
	public Account(int accountNumber, String name, float balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	public Account(int accountNumber, String name) {

		this.accountNumber = accountNumber;
		this.name = name;
		balance=1000;
	}
	
	
	public static String getBankname() {
		return bankname;
	}
	public static void setBankname(String bankname) {
		Account.bankname = bankname;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public void display() {
		System.out.println("Account No: "+accountNumber);
		System.out.println("Name: "+name);
		System.out.println("Balance: "+balance);
		System.out.println("Bank: "+bankname);
	}
	
	public void credit(float amt) throws InvalidCredit{
		if(amt<500){
			
			throw new InvalidCredit("less than 500 credit not allowed");
		}
		else {
			balance=balance + amt;
		}
		
	}
	
	public void debit(float amt) throws InsufficientBalanceexception{
		if(balance- amt<MINIMUM_Balance){
			throw new InsufficientBalanceexception("less balance");
		}
		else {
			balance=balance - amt;
		}
		
		
	}
	
}
