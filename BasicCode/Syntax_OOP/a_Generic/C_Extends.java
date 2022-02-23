package a_Generic;

class E1{}

class E2 extends E1 {
	void print() { System.out.println(this);}
}

class E3 extends E2 {}


public class C_Extends {
	static <T extends E2> void go(T t) {
		((E2)t).print();
	}
	
	public static void main(String[] args) {
		//go(new E1());
		go(new E2());
		go(new E3());
	}
}