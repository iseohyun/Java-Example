package B_Arithmetic;

import A_BasicSyntax.Input;

public class A1_Bracket {
	public static void main(String[] args) {
		int input = Input.getInt();
		int r = 2 + input * 6;	// 식1
		System.out.println("2 + " + input + " x 6 = " + r);

		r = (2 + input) * 6;	// 식2
		System.out.println("(2 + " + input + ") x 6 = " + r);
	}
}

// 실습과제 1: [식1]과 [식2]가 같도록 만드는 입력(input)를 찾을 수 있습니까? 