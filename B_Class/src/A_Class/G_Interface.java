package A_Class;

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

public class G_Interface {
	interface Inter1 {
		// static
		static void showS() {
			System.out.println("Static!");
		}
		
		// default
		default void showD() {
			System.out.println("Default!");
		}
		
		// abstract
		void showA();
	}

	public static void main(String[] args) {
		Inter1 i1 = new Inter1() {
			@Override
			public void showA() {
				System.out.println("Abstract!");
				
			}
		};
		
		// ����
		i1.showA();
		i1.showD();
		Inter1.showS();
	}
}

// �ǽ����� : ���ڸ� 2�� �����ؼ� ���� ū ���� ����ϴ� �������̽��� �ۼ��غ��ϴ�.