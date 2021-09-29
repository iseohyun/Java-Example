package B_Arithmetic;

/**
 * 
 * @author Seohyun Jung
 *
 *	전위 연산과 후위연산을 이해하기 위한 예제 입니다.
 */

public class C_plusplus {
	public static void main(String[] args) {
		int a = 3;
		System.out.println("1 : " + a++);
		System.out.println("* : " + a);
		System.out.println("2 : " + a++);
		System.out.println("* : " + a);
		System.out.println("3 : " + a++);
		System.out.println("* : " + a);
		
		System.out.println("4 : " + ++a);
		System.out.println("* : " + a);
		System.out.println("5 : " + ++a);
		System.out.println("* : " + a);
		System.out.println("6 : " + ++a);
		System.out.println("* : " + a);
		
		System.out.println("7 : " + --a);
		System.out.println("8 : " + --a);
		System.out.println("9 : " + --a);
		System.out.println("0 : " + a--);
		System.out.println("1 : " + a--);
	}
}
