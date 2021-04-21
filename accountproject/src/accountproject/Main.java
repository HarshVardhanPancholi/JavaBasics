package accountproject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("Smith",95);
		Person p1=new Person("Kathy",92);
		Account smith = new Account(2000,p);
		Account kathy = new Account(3000,p1);
		smith.deposit(2000);
		kathy.withdraw(2000);
		System.out.println(smith.getAccNum());
		System.out.println(kathy.getBalance());
		
	}

}
