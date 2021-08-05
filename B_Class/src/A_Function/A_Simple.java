package A_Function;

public class A_Simple {
	public static void main(String[] args) {
		func1();
		func2();
		func1();
		func2();
	}

	static void func1() {
		System.out.println("호출 되었습니다.");
	}
	
	static void func2() {
		System.out.println("두번 째 함수입니다.");
	}
}
