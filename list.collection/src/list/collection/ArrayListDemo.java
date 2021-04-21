package list.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList a1= new ArrayList();

		for(int i=1;i<=5;i++) {
			a1.add(i);
		}
		
		Iterator iterator = a1.iterator();
		while(iterator.hasNext()) {
			Integer i = (Integer)iterator.next();
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
}
