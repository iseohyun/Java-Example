package B2_Interface;

interface Re {
	default String show(String s) {
		return "<"+s+">";
	};
}

public class E_Return {
	public static void main(String [] args) {
		Re r = new Re() {};
		System.out.println(r.show("String01"));
		
		show("String02", r);
	}
	
	static void show(String s, Re r) {
		System.out.println(r.show(s));
	}
}
