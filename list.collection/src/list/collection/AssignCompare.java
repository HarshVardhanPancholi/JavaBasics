package list.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

class AssignStrin implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = (String)o1;
		String s2 = (String)o2;
		return -1*s1.compareTo(s2);
	}
}

public class AssignCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignStrin as = new AssignStrin();
		TreeSet t = new TreeSet(as);
		t.add("Harsh");
		t.add("Mahesh");
		t.add("HarsH");
		t.add("Vishal");
		t.add("Bharat");
		t.add("BHarat");

		SortedSet s = t.subSet("Mahesh", "HarsH");
		Iterator iterator = s.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
