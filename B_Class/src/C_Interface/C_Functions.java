package C_Interface;

@SuppressWarnings("unused")
public class C_Functions {
	interface Inter1{
		public default int sum(int x, int y) { return x+y; }
		private int sub(int x, int y) { return x-y; }
		default int mul(int x, int y) { return x*y; }
		default int dev(int x, int y) { return x/y; }
	}
	
	public static void main(String [] args) {
		Inter1 i1 = new Inter1() {};
		
		System.out.println(i1.sum(12, 3));
		//System.out.println(f.sub(12, 3));
		System.out.println(i1.mul(12, 3));
		System.out.println(i1.dev(12, 3));
	}
}
