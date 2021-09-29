package D_Extends;

public class F_Interface {
	interface Inter1 {
		public abstract void show();
	}

	static class Class1 implements Inter1 {
		public void show() {
			System.out.println("Class 1");
		}
	}

	static class Class2 implements Inter1 {
		public void show() {
			System.out.println("Class 2");
		}
	}

	public static void main(String[] args) {
		Class1 c1 = new Class1();
		Class2 c2 = new Class2();

		c1.show();
		c2.show();
	}
}