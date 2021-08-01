package A_Function;

public class D2_CallCallCall {
	public static void main(String argv[]) {
		func1();
	}

	static void func1() {
		System.out.println("1: 시작한다.");
		func2();
		System.out.println("1: 끝난다.");
	}
	
	static void func2() {
		System.out.println("2: 시작한다.");
		func3();
		System.out.println("2: 끝난다.");
	}
	
	static void func3() {
		System.out.println("3: 시작한다.");
		System.out.println("3: 끝난다.");
	}
}
