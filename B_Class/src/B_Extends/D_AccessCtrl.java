package B_Extends;

/**
 * 
 * ����������
 *
 *	4���� �������� ����� �ֽ��ϴ�.
 *
 *	private			�����
 *	protected		��ӿ��� ����
 *	(�ۼ����� ����)		��Ű�� �ȿ��� ���� ����
 *	public			�ܺο� ���� ����
 *
 */

@SuppressWarnings("unused")
public class D_AccessCtrl {
	static class Parent {
		private int Private = 10;
		protected int Protected = 20;
		int P_Private = 30;	// Package_Private : ��Ű�� �ʿ��� �����Ӱ� ��밡��
		public int Public = 40;
	}

	static class Child extends Parent {
		void display() {
			// System.out.println(Private);
			System.out.println(Protected);
			System.out.println(P_Private);
			System.out.println(Public);
		}
	}

	public static void main(String[] args) {
		Child ch = new Child();
		ch.display();
	}
}

// �ǽ����� : (// System.out.println(Private);����) �ּ��� ����� ������ ���ϴ�.
// �ǽ����� 2: main�� ������, ch�� ��밡���� ����� Ȯ���غ��ϴ�.
//		Ȯ���ϴ� ����� ch.�� �Է����� ��, Popup �޴��� Ȯ���ϸ� �˴ϴ�.