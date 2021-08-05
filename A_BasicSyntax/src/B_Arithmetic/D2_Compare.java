package B_Arithmetic;

public class D2_Compare {
	public static void main(String[] args) {
		int num1 = 8, num2 = -8;

		System.out.println("~ 연산 : "+ ~num1);

		System.out.println("<< 연산 : "+ (num1 << 2));
		System.out.println(">> 연산 : "+ (num2 >> 2));

		System.out.println(">>> 연산 : "+ (num1 >>> 2));
		System.out.println(">>> 연산 : "+ (num2 >>> 2));

		System.out.println(Integer.toHexString(num2).toUpperCase());
		System.out.println(Integer.toHexString(num2>>2).toUpperCase());
		System.out.println(Integer.toHexString(num2>>>2).toUpperCase());
	}
}
