package collproject;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapMain6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,LocalDate> voters = new HashMap<Integer, LocalDate>();
		voters.put(100, LocalDate.of(1998, 12, 5));
		voters.put(101, LocalDate.of(2010, 12, 5));
		voters.put(102, LocalDate.of(2000, 12, 5));
		voters.put(103, LocalDate.of(2020, 12, 5));
		voters.put(104, LocalDate.of(2000, 12, 5));
		voters.put(105, LocalDate.of(2010, 12, 5));
		List<Integer> list = votersList(voters);
		System.out.println(list);
	}

	static List<Integer> votersList(Map<Integer,LocalDate> m){
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = m.keySet();
		for(Integer id:set) {
			LocalDate dob= m.get(id);
			int age = Period.between(dob, LocalDate.now()).getYears();
			if(age>18) {
				list.add(id);
			}
		}
		return list;
	}
}
