package list.collection;

import java.util.IdentityHashMap;


public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdentityHashMap im = new IdentityHashMap();
		
		im.put("id", 1000);
		im.put(1000, "harsh");
		im.put("EmpName","Vardhan");
		System.out.println(im);
		

	}

}
