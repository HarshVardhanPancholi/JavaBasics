package scannerproject;

import java.time.Period;
import java.time.LocalDate;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Period p = Period.of(10, 0, 12);
		System.out.println(p);
		System.out.println(p.addTo(LocalDate.now()));
		LocalDate dob=java.time.LocalDate.of(1998, 12, 8);
		LocalDate b=java.time.LocalDate.now();
		Period p1 = Period.between(dob, b);
		System.out.println(p1);
		

	}

}
