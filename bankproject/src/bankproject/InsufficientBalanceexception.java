package bankproject;

public class InsufficientBalanceexception extends Exception{

	public InsufficientBalanceexception(String message) {
		super(message);
	}
	public void showReason() {
		System.out.println("Withdraw Fail");
	}
}
