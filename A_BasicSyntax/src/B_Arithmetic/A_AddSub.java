package B_Arithmetic;

import A_BasicSyntax.Input;

public class A_AddSub {
	public static void main(String[] args) {
		int a, b = 3;
		a = Input.getNum("a를 입력받습니다.");
		
		System.out.println("Add = " + (a + b));
		System.out.println("Sub = " + (a - b));
		System.out.println("Mul = " + (a * b));
		System.out.println("Dev = " + (a / b));
		System.out.println("Rem = " + (a % b));
	}
}
