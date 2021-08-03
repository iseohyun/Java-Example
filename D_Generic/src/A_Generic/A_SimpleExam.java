package A_Generic;
class A{
	String color;
	A(String init) {
		color = init;
	}
}

class B<T>{
	void show(T t) {
		System.out.println(((A) t).color);
	}
}

public class A_SimpleExam {
	public static void main(String [] args) {
		B<A> b = new B<A>();
		A a1 = new A("RED");
		A a2 = new A("BLUE");
		A a3 = new A("GREEN");
		A a4 = new A("BLACK");
		b.show(a1);
		b.show(a2);
		b.show(a3);
		b.show(a4);
	}
}
