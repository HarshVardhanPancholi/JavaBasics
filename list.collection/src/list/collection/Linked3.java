package list.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Linked3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l = new LinkedList();
		 l.add("Abhay");
		    l.add("Binod");

		    l.add("Raju");
		    l.add("karan");
		    l.add("darsh");
		    l.add("vaibhav");
		    l.add("kanika");
		    l.add("manmeen");
		    l.add("niyati");

		    ListIterator il=l.listIterator();
		    while(il.hasPrevious()) {
		    	String i =(String)il.previous();
		    	
		    }
		    System.out.println(l);
		    
	}

}
