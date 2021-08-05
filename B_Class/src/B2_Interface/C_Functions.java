package B2_Interface;

interface Fs{
	public default int sum(int x, int y) { return x+y; }
	private int sub(int x, int y) { return x-y; }
	default int mul(int x, int y) { return x*y; }
	default int dev(int x, int y) { return x/y; }
}

public class C_Functions {
	public static void main(String [] args) {
		Fs f = new Fs() {};
		
		System.out.println(f.sum(12, 3));
		//System.out.println(f.sub(12, 3));
		System.out.println(f.mul(12, 3));
		System.out.println(f.dev(12, 3));
	}
}
