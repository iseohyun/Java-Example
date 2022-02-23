package b_Lambda;

public class A_Lambda {
	interface A {
		abstract void print();
	}
	
	public static void main(String[] args) {
		A a = () -> System.out.println("A");
		a.print();
	}
}