package scannerproject;
import java.util.Scanner;

public class countin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int l=0;
		int p=0;
		int w=0;
		int s1=1;
		int c=0;
		do {
			l=l+1;
			String s= sc.nextLine();
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==' ') {
					s1=s1+1;
				}
				else if(!s.contains(" ")) {
					s1=1;
					break;
				}
			}
			w=w+s1;
			c=c+(s.length()-(s1-1));

			s1=1;
			p=p+1;
			
		}
		while(sc.hasNextLine()&&p!=2);

		System.out.println("Lines "+l);
		System.out.println("Words "+w);
		System.out.println("Letters "+c);
		sc.close();
	}

}
