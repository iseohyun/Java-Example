package B_Extends;

public class F2_MultImplements {
	interface Show {
		public abstract void show();
	}

	interface Print {
		public abstract void print(String s);
	}

	static class Class1 implements Show, Print {
		public void show() {
			System.out.println("Class 1");
		}

		public void print(String s) {
			System.out.println("1 : " + s);
		}
	}

	static class Class2 implements Show, Print {
		public void show() {
			System.out.println("Class 2");
		}

		public void print(String s) {
			System.out.println("2 : " + s);
		}
	}

	public static void main(String[] args) {
		Class1 c1 = new Class1();
		Class2 c2 = new Class2();

		c1.show();
		c1.print("c1-print");
		c2.show();
		c2.print("c2-print");
	}
}