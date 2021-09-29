package A_Function;

public class E3_Factors {
	public static void main(String[] args) {
		func1(val);
		func1(val);
		func1(val);
		func1(val);
		func1(val);
	}

	static int val = 1;

	static void func1(int input) {
		System.out.println("전역 변수 : " + val);
		input++;
		System.out.println("전달 인자 : " + input);
		System.out.println("==============");
	}
}