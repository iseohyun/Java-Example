package A_Function;

public class D3_Calls {
	public static void main(String argv[]) {
		func1();
	}

	static void func1() {
		System.out.println("1: �����Ѵ�.");
		func2();
		func3();
		System.out.println("1: ������.");
	}
	
	static void func2() {
		System.out.println("2: �����Ѵ�.");
		System.out.println("2: ������.");
	}
	
	static void func3() {
		System.out.println("3: �����Ѵ�.");
		System.out.println("3: ������.");
	}
}
