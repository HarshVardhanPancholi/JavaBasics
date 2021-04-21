package bankproject;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account(10,"Harsh",1000000);
		System.out.println(a.getName());
		try {
			Account.setBankname("ICICI");
			a.display();
			a.debit(6800);
			System.out.println("-------------");
			a.display();
			a.credit(-200);
			System.out.println("-------------");
			a.display();
		}
		catch(InsufficientBalanceexception ibe) {
			ibe.showReason();
		}
		catch(InvalidCredit ic) {
			ic.showReason();
		}
	}

}
