package list.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet j =new TreeSet();
		j.add(4);
		j.add(10);
		j.add(6);
		j.add(4);
		System.out.println(j);
		
		Iterator iterator = j.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
