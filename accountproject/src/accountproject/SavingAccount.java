package accountproject;

public class SavingAccount extends Account{
	public SavingAccount(long accNum, double balance, Person accHolder) {
		super(balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	final double MINIMUM_BALANCE = 500;


	public void withdraw(double w) {
		if(getBalance()> MINIMUM_BALANCE) {
			setBalance(getBalance()-w);
		}
	}
	
}
