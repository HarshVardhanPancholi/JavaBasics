package scannerproject;
import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter comm seperated values");
String data = sc.nextLine();
System.out.println(data);
String [] st =data.split(",");
int id = Integer.parseInt(st[0]);
System.out.println(id);
sc.close();


StringBuffer sb = new StringBuffer("this is sample line");
System.out.println(sb);
sb.append(435);
System.out.println(sb);
sb.delete(3, 7);
System.out.println(sb);
sb.insert(4, 10.0);
System.out.println(sb);
sb.reverse();
System.out.println(sb);
	}

}
