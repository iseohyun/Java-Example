package A_BasicSyntax;

public class E_Typecast {
	public static void main(String[] args) {
		double d1 = 10;
		double d2 = 10 + 3.14;

		System.out.println(d1);
		System.out.println(d2);

		int n = 10;

		System.out.println(n / 3);
		System.out.println((float) n / 3);
		System.out.println(n / 3.0);
	}
}

// �ǽ����� 1: n�� 10 ��� 9876543210L�� �����ϰ�, ������ ���� �ʵ��� �����Ͻʽÿ�.
// �ǽ����� 2: n�� 10 ��� 9876543210�� �����ϰ�, �����غ��ϴ�.