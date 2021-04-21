package list.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		for(int i=-10;i<=10;i++) {
			if(i%2==0) {
				l.offerFirst(i);
			}
			else {
				l.offerLast(i);
			}
			
		}
		System.out.println(l);
		Iterator iterator = l.iterator();
		while(iterator.hasNext()) {
			int i =(Integer)iterator.next();
			
			if(i<0 || i%3!=0) {
				l.remove(iterator);
			}
			else {
				System.out.println(i);
			}
		}
		
		

	}

}
