package b_Lambda;

// Method_Reference

public class B_Reference {
	interface A {
		abstract void print();
	}

	static void func() {
		System.out.println("A");
	}

	public static void main(String[] args) {
		A a = B_Reference::func;
		a.print();
	}
}