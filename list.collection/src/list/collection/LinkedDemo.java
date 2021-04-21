package list.collection;

import java.util.Collections;

import java.util.Vector;

public class LinkedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> l = new Vector<String>();
		Vector<String> l1 = new Vector<String>();
		
    l.add("Abhay");
    l.add("Binod");
    /*l.addLast("Umesh");
    l.addFirst("Harsh");*/
    l.add(2, "Raju");
    l1.add("karan");
    l1.add("darsh");
    l1.add("vaibhav");
    l1.add("kanika");
    l1.add("manmeen");
    l1.add("niyati");
    l1.add("niyati");
    l1.addAll(l);



    //l.removeFirst();
    Collections.sort(l1);
    
   // String s = l.poll();
    System.out.println(l1.capacity());
    System.out.println(Collections.replaceAll(l1,"niyati","j"));
    l1.remove(2);
    l1.trimToSize();
    System.out.println(l1.capacity());
    System.out.println(l1.toString());
	}
	

}
