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


public class G_Interface4 {
	interface Inter1 {
		int a = 10;
	}

	public static void main(String[] args) {
		System.out.println(Inter1.a);
	}
}