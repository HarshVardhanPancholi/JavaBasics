package accountproject;

public class Account {
	private long accNum;
	private double balance;
	private Person accHolder;
	private static long acc=100;
	
	
	
	public Account(double balance, Person accHolder) {
		accNum = ++acc;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	public void deposit(double d) {
		balance=balance + d;
	}
	public void withdraw(double w) {
		balance=balance - w;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double e) {
		balance  = e;
	}
	
	public long getAccNum() {
		return accNum;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
}
