package A_Function;

public class B2_NumOfFactors {
	public static void main(String[] args) {
		func1(1);
		func3(1, 2, 3);
		func2(1, 2);
	}

	static void func1(int input) {
		System.out.println("출력 : " + input);
	}

	static void func2(int input, int input2) {
		System.out.println("출력 : " + input + input2);
	}

	static void func3(int input, int input2, int input3) {
		System.out.println("출력 : " + input + input2 + input3);
	}
}