package b_Operation;

public class A2_Quiz {
	public static void main(String[] args) {
		int a = 2, b = 3, c = 6;
		int r, r2 = 100, r3 = 5;

		// �ǽ����� 1 : �Ʒ� �ڵ� �� ��ȣ()�� �߰��ؼ� 30�� ��µǵ��� �غ���
		r = a + b * c;
		System.out.println("a + b * c = " + r);

		// �ǽ����� 2 : ���Կ�����(+=,-=,*=,/=,%=)�� ����ؼ� r2�� 2�� ������
		// ��) r2 %= 7;
		System.out.println("r2 = " + r2);

		// �ǽ����� 3 : ����������(++,--)�� ����ؼ� r3�� 6�� ����غ���
		System.out.println("r3 = " + r3);
	}
}