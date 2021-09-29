package B_String;

public class C_Concat {
	public static void main(String[] args) {
		String str = new String("Java");
		System.out.println("Origin : " + str);

		System.out.println(str.concat("Class"));

		System.out.println("After concat() : " + str);

		System.out.println("to".concat("get").concat("her"));
	}
}