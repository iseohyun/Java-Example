package A_Function;

public class B3_DiffTypes {
	public static void main(String[] args) {
		func1(1);
		func2(1.1f);
		func3("String");
	}

	static void func1(int input) {
		System.out.println("��� : " + input);
	}

	static void func2(float input) {
		System.out.println("��� : " + input);
	}

	static void func3(String input) {
		System.out.println("��� : " + input);
	}
}