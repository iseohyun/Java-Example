package a_Class;

/**
 * 
 * �������̽�: ������ ����(����� ����), �޼���θ� ������ Ư���� Ŭ����
 * 
 *	Java������ class�� ���� ��� �� �� ����. �� interface�� ���� ����� �����մϴ�.
 *
 *	�������̽��� ���� �� �ִ� �޼���� 3���� Ÿ���� �ֽ��ϴ�. �ϱⰡ �ʿ��մϴ�.
 *		default	: ���� �Ϲ����� ����
 *		static	: �޸� ������(�ν��Ͻ� ���� ����� ����)
 *		abstract: �����⸸ ����(������ �ʿ�)
 *
 */


public class G_Interface3 {
	interface Inter1 {
		void abstract1();
	}

	public static void main(String[] args) {
		Inter1 i1 = new Inter1() {
			@Override
			public void abstract1() {
				System.out.println("Abstract!");
				
			}
		};
		
		i1.abstract1();
	}
}

// �ǽ����� : ���ڸ� 2�� �����ؼ� ���� ū ���� ����ϴ� �������̽��� �ۼ��غ��ϴ�.