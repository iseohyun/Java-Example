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

// �ǽ����� : AND�� ����� "0x0", OR�� ����� "0xFF"�� ��µǵ��� a�� �����غ��ʽÿ�.