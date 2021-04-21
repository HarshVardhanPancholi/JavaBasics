package list.collection;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack stc = new Stack();
		for(int i=100; i<=150; i=i+2) {
			stc.push(i);
		}
		System.out.println(stc);
		for(int i=0;i<stc.size();i++) {
			System.out.println(stc.get(i)); 
		}
		
	}

}
