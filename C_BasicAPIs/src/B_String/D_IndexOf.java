package B_String;

public class D_IndexOf {
	public static void main(String[] args) {
		String str = new String("Oracle Java");

		System.out.println("o: " + str.indexOf('o'));
		System.out.println("O: " + str.indexOf('O'));
		System.out.println("a: " + str.indexOf('a'));
		System.out.println("a(backword): " + str.lastIndexOf('a'));
		System.out.println("Java: " + str.indexOf("Java"));
	}
}
