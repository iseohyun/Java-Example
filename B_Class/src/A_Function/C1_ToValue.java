package A_Function;

public class C1_ToValue {
	public static void main(String argv[]) {
		int output = 0;
		output = func1(func1(1));
		System.out.println("��� : " + output);
	}

	static int func1(int input) {
		System.out.println("�Է� : " + input);
		return input + 1;
	}
}
