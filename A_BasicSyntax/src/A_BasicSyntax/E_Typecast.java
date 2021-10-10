package A_BasicSyntax;

public class E_Typecast {
	public static void main(String[] args) {
		double d1 = 10;
		double d2 = 10 + 3.14;

		System.out.println(d1);
		System.out.println(d2);

		int n = 10;

		System.out.println(n / 3);
		System.out.println((float) n / 3);
		System.out.println(n / 3.0);
	}
}

// 실습과제 1: n을 10 대신 9876543210L를 저장하고, 에러가 나지 않도록 수정하십시오.
// 실습과제 2: n을 10 대신 9876543210를 저장하고, 실행해봅니다.