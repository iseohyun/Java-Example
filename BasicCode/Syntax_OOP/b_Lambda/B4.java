package b_Lambda;

// Method_Reference

public class B4 {
	interface A {
		abstract void print(String x);
	}

	public static void main(String[] args) {
		A a = System.out::println;
		a.print("test program");
	}
}