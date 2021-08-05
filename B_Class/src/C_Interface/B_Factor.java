package C_Interface;

public class B_Factor {
	interface Inter1{
		default void show(String s) { System.out.println(s);}
	}
	public static void main(String[] args) {
		Inter1 i1 = new Inter1(){};
		i1.show("print");
	}
}
