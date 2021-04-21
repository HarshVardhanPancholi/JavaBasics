package bankproject;

public class InvalidCredit extends RuntimeException{
	public InvalidCredit(String message) {
		// TODO Auto-generated constructor stub
	
		super(message);
	}
	public void showReason() {
		System.out.println("Withdraw Fail");
	}
}
