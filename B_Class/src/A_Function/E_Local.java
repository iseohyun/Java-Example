package A_Function;

public class E_Local {
	public static void main(String[] args) {
		func1();
		func1();
		func1();
		func1();
		func1();
	}

	static void func1() {
		int val = 1;
		val++;
		System.out.println("로컬 변수 : " + val);
	}
}