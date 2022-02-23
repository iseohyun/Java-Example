package b_Extends;

public class F_Interface {
	interface Inter1 {
		public abstract void print();
	}

	static class Class1 implements Inter1 {
		public void print() {
			System.out.println("Class 1");
		}
	}

	public static void main(String[] args) {
		Class1 c1 = new Class1();

		c1.print();
	}
}