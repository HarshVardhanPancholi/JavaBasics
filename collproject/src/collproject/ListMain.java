package collproject;
import java.util.*;

public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Employee> s1 = new HashSet<Employee>();

		s1.add(new Employee(100, "Harsh"));
		s1.add(new Employee(200, "Mahesh"));
		s1.add(new Employee(2000, "Mahesh"));
		Employee x = new Employee(100, "Harsh");
		System.out.println(s1.contains(x));
		for(Employee e: s1) {
			System.out.println(e.getEmpId());
		}
		System.out.println("-----------------------------------------------------");
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(12);
		a.add(56);
		a.add(1020);
		a.add(6058);
		a.add(67);
		
		List<Integer> s= getSorted(a);
		for(Integer e: s) {
			System.out.println(e);
		}
		

	}
	
	static List<Integer> getSorted(ArrayList<Integer> list){
		ArrayList<Integer> newl = new ArrayList<Integer>();
		for(int x: list) {
			int r = reverse(x);
			newl.add(r);
		}
		Collections.sort(newl);
		return newl;
		
	}
	static int reverse(int n) {
		int n1=0;
		while(n>0) {
			int d = n%10;
			n1= n1 *10 +d;
			n= n/10;
			
		}
		return n1;
	}

}
