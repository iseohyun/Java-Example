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
		System.out.println("���� ���� : " + val);
		input++;
		System.out.println("���� ���� : " + input);
		System.out.println("==============");
	}
}