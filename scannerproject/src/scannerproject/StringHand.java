package scannerproject;
public class StringHand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getImage("qwerty"));
		System.out.println(modifyNumber(97652));

	}
	static String getImage(String s) {
		String h="";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		h=sb.toString();
		h=s+"|"+h;
		return h;
	}
	static int modifyNumber(int s) {
		int p=s;
		int c=1;
		int t=0;
		while(s>=10) {
			t=s%10;
			p=p-(((int)Math.pow(10, c))*t);
			s=s/10;
			c=c+1;
			t=0;
			
		}
		return p;
	}

}
