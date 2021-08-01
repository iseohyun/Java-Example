package A_Function;

public class C_Return {
	public static void main(String argv[]) {
		int output = 0;
		output = func1(1);
		System.out.println("출력 : " + output);
	}

	static int func1(int input) {
		System.out.println("입력 : " + input);
		return input + 1;
	}
}
