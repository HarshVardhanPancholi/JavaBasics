package collproject;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch[] = {'a','s','a','r','g','h','j','y','u','i','o'};
		//System.out.println(countChars(ch));
		
		Set<Character> set = countChars(ch).keySet();
		
		for(Character c:  set) {
			System.out.println("Character: "+c+" Count: "+countChars(ch).get(c));
		}
	}
	static Map<Character,Integer> countChars(char [] carr){
		TreeMap<Character, Integer> map =new TreeMap<Character, Integer>();
		for(char ch: carr) {
			if(map.containsKey(ch)) {
				int count= map.get(ch);
				count++;
				map.put(ch, count);
			}
			else {
				map.put(ch, 1);
				
			}
		}
		return map;
	}

}
