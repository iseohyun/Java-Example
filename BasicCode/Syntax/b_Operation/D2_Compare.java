package b_Operation;

public class D2_Compare {
	public static void main(String[] args) {
		int num1 = -100;

		System.out.println("연산없음\t[" + toBin(num1) + "] " + num1);
		System.out.println("~ 연산 \t[" + toBin(~num1) + "] " + ~num1);
		System.out.println("<< 연산\t[" + toBin(num1 << 2) + "]" + (num1 << 2));
		System.out.println(">> 연산\t[" + toBin(num1 >> 2) + "] " + (num1 >> 2));
		System.out.println(">>> 연산\t[" + toBin(num1 >>> 2) + "] " + (num1 >>> 2));
	}

	static String toBin(int num) {
		String str = "";
		for (int i = 0; i < 32; i++) {
			str = ((num % 2 == 0) ? "0" : "1") + str;
			num >>= 1;
		}
		return str;
	}
}

// 실습과제 : 양수(예:8)를 입력해봅니다.
// 실습과제 : 음수(예:-8)를 입력해봅니다.
// 실습과제 : shift연산 <<2가 x4와 동일한 효과가 나타나는 것은 우연일까요? x8이 될 수 있도록 코드를 수정해봅니다.