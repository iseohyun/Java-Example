package b_Lambda;

public class A2 {
	interface A {
		abstract void print(int x);
	}

	public static void main(String[] args) {
		A a = x -> System.out.println(x);
		a.print(1);
	}
}