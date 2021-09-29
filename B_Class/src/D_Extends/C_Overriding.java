package D_Extends;

public class C_Overriding {
	static class Parent {
		void display() {
			System.out.println("Class Top");
		}
	}

	static class Child extends Parent {
		void display() {
			System.out.println("Class 2");
		}
	}

	public static void main(String[] args) {
		Parent pa = new Parent();
		pa.display();
		Child ch = new Child();
		ch.display();
		Parent pc = new Child();
		pc.display();
		// Child cp = new Parent();
	}
}