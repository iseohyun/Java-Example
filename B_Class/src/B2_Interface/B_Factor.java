package B2_Interface;

interface F{
	default void show(String s) { System.out.println(s);}
}

public class B_Factor {
	public static void main(String [] args) {
		F f = new F(){};
		f.show("print");
	}
}
