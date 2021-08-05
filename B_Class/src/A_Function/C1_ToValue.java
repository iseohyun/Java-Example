package A_Function;

public class C1_ToValue {
	public static void main(String[] args) {
		int output = 0;
		output = func1(func1(1));
		System.out.println("출력 : " + output);
		
		// TODO : func1( func1 (func1 (func1 (1))))은 어떤 수가 출력이 될까요?
		
	}

	static int func1(int input) {
		System.out.println("입력 : " + input);
		return input + 1;
	}
}
