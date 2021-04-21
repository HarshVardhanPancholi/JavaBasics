package scannerproject;
//import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		System.out.println(x);
		sc.close();*/
		
		StringBuffer sb = new StringBuffer("this is sample line");
		System.out.println(sb.capacity());
		
		long start = System.nanoTime();
		String s="";

		for(char i='A';i<='Z';i++) {
			s=s+i;
		}
		System.out.println(s);
		long end = System.nanoTime();
		System.out.println(end-start);
		
		long start1 = System.nanoTime();
		
		StringBuffer s1 = new StringBuffer();
		for(char i='A';i<='Z';i++) {
			s1.append(i);
		}
		System.out.println(s);
		long end1 = System.nanoTime();
		System.out.println(end1-start1);
		
	}

}
