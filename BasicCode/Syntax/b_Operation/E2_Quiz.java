package b_Operation;

public class E2_Quiz {
	public static void main(String[] args) {
		int a = 64, r = 0;

		// �ǽ����� 1: shift(<<, >>)������ ���ؼ�, 8�� ����ϼ���.
		// r = a >> ?;
		r = a >> 3;

		System.out.println("1. ���� ��� : " + r);

		// �ǽ����� 2: shift(<<, >>)������ ���ؼ�, 256�� ����ϼ���.
		// r = a << ?;
		System.out.println("2. ���� ��� : " + r);

		r = 0x000FFFAA;
		// �ǽ����� 3: 0->1, 1->0���� �ٲپ ����ϼ���. (���� : FFF00055)
		// r = ?;
		System.out.println("3. ���� ��� : " + Integer.toHexString(r).toUpperCase());
	}
}
