package list.collection;

import java.awt.List;
import java.util.Enumeration;
import java.util.Vector;

public class Enumera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v2= new Vector();
		for(int i=0;i<10;i++) {
			v2.add(i);
		}
		Enumeration r =v2.elements();
		while(r.hasMoreElements()) {
			System.out.println(r.nextElement());
		}
	}

}
