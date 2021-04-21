package scannerproject;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pattern p = Pattern.compile("[0-9]{2}AB.{2}X");
		
		Scanner sc = new Scanner(System.in);
		String i = sc.nextLine();
		System.out.println(Pattern.matches("[0-9]{2}AB.{2}X", i));
		sc.close();
	}

}
