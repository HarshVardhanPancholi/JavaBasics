package objecttest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee(100,"Harsh",800000,Gender.MALE);
		Employee e2= new Employee(101,"Mahesh",85000,Gender.MALE);
		System.out.println(e1);
		System.out.println(e2.equals(e1));
		System.out.println(e2.hashCode());

	}

}
