package B_Arithmetic;

public class E_BitCompare {
	public static void main(String[] args) {
		int a = 8, b = -8;

		System.out.println("~ 연산 : "+ ~a);

		System.out.println("<< 연산 : "+ (a << 2));
		System.out.println(">> 연산 : "+ (b >> 2));

		System.out.println(">>> 연산 : "+ (a >>> 2));
		System.out.println(">>> 연산 : "+ (b >>> 2));

		System.out.println(Integer.toHexString(b).toUpperCase());
		System.out.println(Integer.toHexString(b>>2).toUpperCase());
		System.out.println(Integer.toHexString(b>>>2).toUpperCase());
	}
}
