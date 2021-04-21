package scannerproject;

public class Dummy {
	int x;
	long y[] = new long[1000];

	public Dummy(int i) {
		x=i;
	}
	public void finalize() {
		System.out.println("Object with value "+x+" is removed");
	}

}
