package b_Operation;

public class A_AddSub {
	public static void main(String[] args) {
		int a = 100, b;
		b = tools.Input.getInt();
		
		System.out.println("���ϱ� = " + (a + b));
		System.out.println("���� = " + (a - b));
		System.out.println("���ϱ� = " + (a * b));
		System.out.println("������(��) = " + (a / b));
		System.out.println("������(������) = " + (a % b));
	}
}

// �ǽ����� 1 : ������(��)�� 10�� �ǵ��� �Է��� �غ��ʽÿ�.
// �ǽ����� 2 : ������(������)�� 16�� �ǵ��� �Է��� �غ��ʽÿ�.
// �ǽ����� 3(����) : ������(������)�� 16�� �Ǵ� ��� ���ڸ� ã�ƺ��ʽÿ�.