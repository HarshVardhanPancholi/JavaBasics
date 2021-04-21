package collproject;

import java.util.ArrayList;
import java.util.Collections;

public class MapMain5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,56,48,2,54,5,485,21,56,5,6};
		System.out.println(getSecondSmallest(a));
	}
	static int getSecondSmallest(int []a) {
		ArrayList<Integer> s= new ArrayList<Integer>();
		for(int i:a) {
			s.add(i);
			
		}
		Collections.sort(s);
		return s.get(1);
		
	}

}
