package list.collection;

import java.util.Arrays;
import java.util.Comparator;


class AssignStri implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = (String)o1;
		String s2 = (String)o2;
		return -1*s1.compareTo(s2);
	}
}

public class ArraysDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String empnames[]= {"Harsh", "Vardhan", "Mahesh", "Vishal"};
		for(String e:empnames) {
			System.out.println(e);
		}
		Arrays.sort(empnames);
		System.out.println("-----------");
		for(String e:empnames) {
			System.out.println(e);
		}
		Arrays.sort(empnames,new AssignStri());
		System.out.println("-----------");
		for(String e:empnames) {
			System.out.println(e);
		}
	}

}
