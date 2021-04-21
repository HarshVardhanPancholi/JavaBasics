package collproject;

import java.util.HashMap;

public class MapMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Float> hm= new HashMap<Integer, Float>();
		hm.put(1000, 97f);
		hm.put(1001, 65f);
		hm.put(1002, 75f);
		hm.put(1003, 85f);
		hm.put(1004, 95f);
		hm.put(1005, 88f);
		hm.put(1006, 78f);
		hm.put(1007, 71f);
		hm.put(1008, 70f);
		hm.put(1009, 79f);
		hm.put(1010, 83f);

		
		for(Integer i: getStudents(hm).keySet()) {
			System.out.println("Student's ID : "+i+" will get "+getStudents(hm).get(i)+"\tmedal");
		}
	}
	static HashMap<Integer, String> getStudents(HashMap<Integer,Float> hm){
	
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		for(Integer i: hm.keySet()) {
			if(hm.get(i)>=90) {
				map.put(i, "Gold");
			}
			else if(hm.get(i)>=80 && hm.get(i)<90) {
				map.put(i, "Silver");
			}
			else if(hm.get(i)>=70 && hm.get(i)<80) {
				map.put(i, "Bronze");
			}
			
		}
	
		return map;
	}

}
