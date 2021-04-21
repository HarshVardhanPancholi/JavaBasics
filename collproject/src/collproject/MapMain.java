package collproject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(10, "Jaipur");
		hm.put(20, "Delhi");
		hm.put(30, "Mumbai");
		hm.put(40, "Kolkata");
		hm.put(50, "Ajmer");
		for(String city: hm.values()) {
			System.out.println(city);
		}
		String city = hm.get(60);
		if(city != null)
			System.out.println(city);
		else
			System.out.println("Not found");
		
		List<String> l = getValues(hm);
		System.out.println(l);
	}

	static List<String> getValues(HashMap<Integer,String> hm){
		Collection<String> col = hm.values();
		List<String> list = new ArrayList<String>();
		list.addAll(col);
		Collections.sort(list);
		return list;
	}
}
