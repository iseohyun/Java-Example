package B_Arithmetic;

public class E_BitCompare {
	public static void main(String[] args) {
		int a = 8, b = -8;

		System.out.println("~ ���� : "+ ~a);

		System.out.println("<< ���� : "+ (a << 2));
		System.out.println(">> ���� : "+ (b >> 2));

		System.out.println(">>> ���� : "+ (a >>> 2));
		System.out.println(">>> ���� : "+ (b >>> 2));

		System.out.println(Integer.toHexString(b).toUpperCase());
		System.out.println(Integer.toHexString(b>>2).toUpperCase());
		System.out.println(Integer.toHexString(b>>>2).toUpperCase());
	}
}
