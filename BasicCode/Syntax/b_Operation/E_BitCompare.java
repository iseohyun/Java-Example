package b_Operation;

public class E_BitCompare {
	public static void main(String[] args) {
		int a = 0xF0, b = 0xAA;

		System.out.println("a = " + a + "[" + Integer.toBinaryString(a) + "]");
		System.out.println("b = " + b + "[" + Integer.toBinaryString(b) + "]");
		System.out.println("a AND b = 0x" + Integer.toHexString(a & b).toUpperCase() + "(" + (a & b) + ")");
		System.out.println("a OR b = 0x" + Integer.toHexString(a | b).toUpperCase() + "(" + (a | b) + ")");
		System.out.println("a XOR b = 0x" + Integer.toHexString(a ^ b).toUpperCase() + "(" + (a ^ b) + ")");
		System.out.println("!a = 0x" + Integer.toHexString(~a).toUpperCase() + "(" + (~a) + ")");
	}
}

// 실습과제 : AND의 결과가 "0x0", OR의 결과는 "0xFF"가 출력되도록 a를 수정해보십시오.