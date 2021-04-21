package arrayproject;

public class Varargmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumNum(12,45,86));
		System.out.println("-----------");
		System.out.println(sumNum(86));
		System.out.println("-----------");
		System.out.println(sumNum());
		System.out.println("-----------");

	}
	static int sumNum(int ...x) {
		int sum=0;
		for(int i=0; i<x.length;i++) {
			sum = sum+x[i];
		}
		return sum;
	}
	

}
