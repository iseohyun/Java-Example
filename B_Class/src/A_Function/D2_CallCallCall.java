package A_Function;

public class D2_CallCallCall {
	public static void main(String argv[]) {
		func1();
	}

	static void func1() {
		System.out.println("1: �����Ѵ�.");
		func2();
		System.out.println("1: ������.");
	}
	
	static void func2() {
		System.out.println("2: �����Ѵ�.");
		func3();
		System.out.println("2: ������.");
	}
	
	static void func3() {
		System.out.println("3: �����Ѵ�.");
		System.out.println("3: ������.");
	}
}
