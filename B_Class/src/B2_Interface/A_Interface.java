package B2_Interface;

interface I{
	default void show() { System.out.println("A");}
}

public class A_Interface {
	public static void main(String [] args) {
		I i = new I(){};
		i.show();
	}
}
