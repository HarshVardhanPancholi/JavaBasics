package list.collection;

import java.util.Arrays;

public class ArraysDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cid[] = {1,5,10,45,0};
		for (int i=0; i<cid.length;i++) {
			System.out.println("Index is  "+i+" of element is "+cid[i]);
		}
		System.out.println("-------------");
		Arrays.sort(cid);
		for (int i=0; i<cid.length;i++) {
			System.out.println("Index is  "+i+" of element is "+cid[i]);
		}
	}

}
