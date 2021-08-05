package C_Interface;

public class E_Return {
	interface Inter1 {
		default String show(String s) {
			return "<"+s+">";
		};
	}

	public static void main(String [] args) {
		Inter1 i1 = new Inter1() {};
		System.out.println(i1.show("String01"));
		
		show("String02", i1);
	}
	
	static void show(String s, Inter1 inter) {
		System.out.println(inter.show(s));
	}
}
