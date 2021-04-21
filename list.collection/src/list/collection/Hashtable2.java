package list.collection;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hashtable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map hm = new LinkedHashMap();
		hm.put(1, "djsd");
		hm.put("tree", 100);
		
		Hashtable ht = new Hashtable(hm);
		System.out.println(ht);
	}

}
