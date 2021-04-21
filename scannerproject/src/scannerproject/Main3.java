package scannerproject;
//import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		int sum=0;
		String []st= s.split(" ");
		for(String x:st) {
			System.out.println(Integer.parseInt(x));
			sum=sum+ Integer.parseInt(x);
		}
		System.out.println(sum);
		sc.close();*/
		LocalDate d2=LocalDate.of(1997,12,8);
		Period t= meth(d2);
		int years= t.getYears();
		int month = t.getMonths();
		int days = t.getDays();
		System.out.println(years);
		System.out.println(month);
		System.out.println(days);
	}
	
	static Period meth(LocalDate d) {
		LocalDate d1 =  LocalDate.now();
		Period p= Period.between(d, d1);
		return p;
	}

}
