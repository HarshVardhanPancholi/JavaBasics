package scannerproject;

//import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*long time = System.currentTimeMillis();
		Date d=new Date(time);
		System.out.println(d); */
		/*String s1= new String("Hello jsajk");
		System.out.println(s1.charAt(6));
		System.out.println(s1.substring(2,4));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.indexOf("js"));*/
		for(int i=1;i<100;i++) {
			new Dummy(i);
			if(i%10==0) {
			System.gc();}
		}
		System.out.println("Done");
	}

}
