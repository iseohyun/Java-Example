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


public class G_Interface2 {
	interface Inter1 {
		// default
		default void default1() {
			System.out.println("Default!");
		}
	}

	public static void main(String[] args) {
		Inter1 i1 = new Inter1() {
		};
		i1.default1();
	}
}