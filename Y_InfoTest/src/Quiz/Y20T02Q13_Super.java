package Quiz;

class A{
	int a;
	public A(int n) {
		a = n;
	}
	public void print() {
		System.out.println("a=" + a);
	}
}

class B extends A {
	public B(int n) {
		super(n);
		super.print();
	}
}
public class Y20T02Q13_Super {	
	public static void main(String[] args) {
		B obj = new B(10);
	}
}