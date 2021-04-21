package arrayproject;
import java.util.Arrays;
import com.trg.Student;

public class ArrayMain {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		//initialize array
		int y[]= {10,25,88,98,46,35};
		String c[]= {"ch","BW","we","sd","AW","as"};
		Student st = new Student(10,"Harsh",y);
		for(int fg: st.getMarks()){
			System.out.println(fg);
		}
		System.out.println("---------");
		//int sum=0;
		//Employee e1[]= {new Employee(10,10.0f,"te") , new Employee(50,45.0f,"ui")};
		
		//for(int i=0; i< e1.length; i++) {
		//	e1[i].show();
		//}
		
		//for(int i=0; i< y.length; i++) {
		//	sum =sum+y[i];
		//}
		//for each
		//for(int x :y) {
		//	System.out.println((x+20));
		//}
		//float avg = sum/y.length;
		//System.out.println(avg);
		Arrays.sort(y);
		
		//for(int x :y) {
		//	System.out.println(x);
		//}
		System.out.println(getSecondSmallest(y));
		String s[] = sortStrings(c);
		for(String x : s) {
			System.out.println(x);
		}
		int s1[] = getSorted(y);
		for(int x : s1) {
			System.out.println(x);
		}
		
		
	}
	 static int getSecondSmallest(int[] a) {
		 int a1[]= Arrays.copyOf(a, a.length);
		 Arrays.sort(a1);
		 return a1[1];
	 }
	 static String[] sortStrings(String[] arr) {
		 String a1[]= Arrays.copyOf(arr, arr.length);
		 Arrays.sort(a1);
		 return a1;
	 }
	 static int[] getSorted(int[] arr) {
		 int a1[]= Arrays.copyOf(arr, arr.length);
		 int a2[] = new int[a1.length];
		 for(int i=0;i<a1.length;i++) {
			 while(a1[i] !=0) {
				 int t=a1[i]%10;
				 a2[i]=a2[i]*10+t;
				 a1[i] = a1[i]/10;	 
			 } 
		 }
		 Arrays.sort(a2);
		 return a2;
	 }
	 
}
