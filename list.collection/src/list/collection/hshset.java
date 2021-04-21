package list.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class hshset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet j =new LinkedHashSet();
		j.add(4);
		j.add(null);
		j.add("ds");
		j.add(4);
		System.out.println(j);
		
		Iterator iterator = j.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
