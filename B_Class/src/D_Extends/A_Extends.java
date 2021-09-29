package D_Extends;

public class A_Extends {
	static class Parent {
		String str = "Parent";
	}

	static class Child extends Parent {
		String str2 = "Child";
	}

	public static void main(String[] args) {
		Child c1 = new Child();

		System.out.println(c1.str);
		System.out.println(c1.str2);
	}
}