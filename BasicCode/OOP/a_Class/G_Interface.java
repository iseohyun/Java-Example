package a_Class;

/**
 * 
 * �������̽�: ������ ����(����� ����), �޼���θ� ������ Ư���� Ŭ����
 * 
 *	Java������ class�� ���� ��� �� �� ����. �� interface�� ���� ����� �����մϴ�.
 *
 *	�������̽��� ���� �� �ִ� �޼���� 3���� Ÿ���� �ֽ��ϴ�. �ϱⰡ �ʿ��մϴ�.
 *		static	: �޸� ������(�ν��Ͻ� ���� ����� ����)
 *		default	: ���� �Ϲ����� ����
 *		abstract: �����⸸ ����(������ �ʿ�)
 *
 */


public class G_Interface {
	interface Inter1 {
		static void static1() {
			System.out.println("Static!");
		}
	}

	public static void main(String[] args) {
		Inter1.static1();
	}
}