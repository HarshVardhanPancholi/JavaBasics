package list.collection;

import java.util.Comparator;
import java.util.TreeMap;
class Comp implements Comparator{
	int i;
	@Override
	public int compare(Object o1, Object o2) {
		
		if(o1 instanceof Integer && o2 instanceof Integer) {
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		
		i= i1>i2?-1:i1<i2?1:0;
		}
		else if(o1 instanceof String && o2 instanceof String) {
			String s1 = (String)o1;
			String s2 = (String)o2;
			i= -1*s1.compareTo(s2);
		}
		return i;
	}
}

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 TreeMap tm = new TreeMap(new Comp());


     tm.put(10, "Google");
     tm.put(25, "Ball");
     tm.put(15, "why");
     tm.put(30, "Dusk");
     tm.put(20, "Yesterday");
         
     TreeMap tm1 = new TreeMap(new Comp());
     tm1.put("Apple", 1);
     tm1.put("Bat", 2);
     tm1.put("Interrogation", 4);
     tm1.put("Dawn", 3);
     tm1.put("Tommorrow", 5);
 
     for(Object i: tm.keySet()) {
    	 System.out.println(tm.get(i));
     }
     System.out.println("---------------------");
     for(Object i: tm1.keySet()) {
    	 System.out.println(tm1.get(i));
     }
	}

}
