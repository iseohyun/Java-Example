package C_Interface;

public class A_Interface {
	interface Inter1{
		default void show() { System.out.println("A");}
	}

	public static void main(String[] args) {
		Inter1 i1 = new Inter1(){};
		i1.show();
	}
}
