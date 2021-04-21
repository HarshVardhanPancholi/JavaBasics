package collproject;

import java.util.*;
public class MapMain3 {

	public static void main(String[] args) {
		int a[]= {1,2,5,4,8,9,7,21,56,10,45,89,100,0,23,14};
		Map<Integer, Integer> hm =getSquares(a);
		for(Integer i: hm.keySet()) {
			System.out.println("Number: "+i+" Square Value: "+hm.get(i));
		}

	}
	static Map<Integer,Integer> getSquares(int [] a){
		TreeMap<Integer, Integer> h=new TreeMap<Integer, Integer>();
		for(int i: a) {
			h.put(i, (i*i));
		}
		return h;
	}

}
