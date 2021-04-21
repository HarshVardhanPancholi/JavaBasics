package list.collection;
import java.util.Hashtable;
import java.util.Scanner;
public class HashTableDemo3 {

	public static void main(String[] args) {
		Hashtable tb = new Hashtable();
		String s ="harsh \nvardhan \npancholi ";
		Scanner sc =new Scanner(s);
		Object obj = new Object();
		Integer i =1;
		while(sc.hasNext()) {
			obj = sc.next();
			try {
				tb.put(obj, i);
				i++;
			}
			catch(NullPointerException e){
				System.out.println(e);
				sc.close();
			
			}
		}
		sc.close();
		
		System.out.println(tb);
		

	}

}
