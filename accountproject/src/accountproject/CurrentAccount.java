package accountproject;

public class CurrentAccount extends Account {
	double overdraftLimit;


	public CurrentAccount(long accNum, double balance, Person accHolder, double overdraftLimit) {
		super(balance, accHolder);
		this.overdraftLimit = overdraftLimit;
	}


	public void withdraw(double w) {
		if(getBalance()< overdraftLimit) {
			setBalance(getBalance()-w);
		}

}
}