package b_Operation;

import tools.Input;

public class D2_Compare {
	public static void main(String[] args) {
		int num1 = Input.getInt();

		System.out.println("~ 연산 : " + ~num1);

		System.out.println("<< 연산 : " + (num1 << 2));
		System.out.println("연산없음\t[" + Integer.toHexString(num1).toUpperCase()+"] "+(num1 >> 2));
		System.out.println(">> 연산\t[" + Integer.toHexString(num1 >> 2).toUpperCase()+"] "+(num1 >> 2));
		System.out.println(">>> 연산\t[" + Integer.toHexString(num1 >>> 2).toUpperCase()+"] "+(num1 >>> 2));
	}
}

// 실습과제 : 양수(예:8)를 입력해봅니다.
// 실습과제 : 음수(예:-8)를 입력해봅니다.
// 실습과제 : shift연산 <<2가 x4와 동일한 효과가 나타나는 것은 우연일까요? x8이 될 수 있도록 코드를 수정해봅니다.