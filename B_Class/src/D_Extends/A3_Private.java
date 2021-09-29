package D_Extends;

@SuppressWarnings("unused")
public class A3_Private {
	static class Parent {
		private int a = 10;
		public int b = 20;
	}

	static class Child extends Parent {
		public int c = 30;

		void display() {
			// System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		Child ch = new Child();
		ch.display();
	}
}