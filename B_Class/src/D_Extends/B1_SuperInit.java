package D_Extends;

public class B1_SuperInit {
	static class Parent {
		int a = 10;

		Parent() {
			a = 15;
		}

		Parent(int n) {
			a = n;
		}

		void add1() {
			a++;
		}
	}

	static class Child extends Parent {
		int a = 20;

		Child() {
			super();
		}

		Child(int n) {
			super(n);
			this.a = 100;
		}

		void display() {
			System.out.println("Parent : " + super.a + " /Child : " + this.a);
		}
	}

	public static void main(String[] args) {
		Child ch = new Child();
		Child ch2 = new Child(50);
		ch.display();
		ch2.display();
	}
}