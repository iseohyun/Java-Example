package A_BasicSyntax;

/**
 * 
 *	 ���ڿ� ���ڸ� �����ϴ� ������ ǥ������� ���̰� �ִ� ���̰�,
 *	������ �Ҽ��� �������� ���̰� �ֽ��ϴ�.
 *	 String�� ���� �ƴϰ�, Ŭ������� ��������, �ϴ��� Ÿ���̶�� �ϱ��Ͻô� ���� ���ڽ��ϴ�.
 *
 *	�ݵ�� �ܿ��� �� ����
 *		��/����
 *					: boolean
 *		����
 *			����		: byte, short, int, long 
 *			�Ҽ�		: float, double
 *		����
 *			����		: char
 *			���ڿ�	: String
 *  
 */

public class D1_VarTypes {
	public static void main(String[] args) {
		boolean a = true;
		System.out.println("Boolean : " + a);
		
		byte b = 1;
		System.out.println("Byte: " + b);
		
		short s = 2;
		System.out.println("Short: " + s);
		
		int i = 4;
		System.out.println("Integer: " + i);
		
		long l = 8;
		System.out.println("Long: " + l);
		
		// ���� : float�� ǥ���� �� ���� �ڿ� f�� �ٿ��ݴϴ�.
		// f�� ������, double�� �ν��մϴ�.
		float f = 5.5f;
		System.out.println("Float: " + f);
		
		double d = 6.5;
		System.out.println("Double: " + d);
		
		char c = 'c'; 
		System.out.println("Character: " + c);

		String str = "text";
		System.out.println("String: " + str);
	}
}

// �ǽ����� 1: ��� ������ �����ϰ�, ����Ÿ������ ������ ���� �����ϰ� 99999�� �����ϼ���. (�������� �����Ӱ� �����ϼ���)
// �ǽ����� 2: ��� ������ �����ϰ�, �Ҽ�Ÿ������ ������ �����ϰ� 3.14�� �����ϼ���. (�������� �����Ӱ� �����ϼ���)