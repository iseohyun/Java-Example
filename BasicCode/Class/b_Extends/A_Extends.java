package b_Extends;

/**
 * 
 * ��� : Ŭ������ ����ϴ� �ٽ��� �ڵ������� �ʹ� �����ϴٴ� ���Դϴ�.
 * �ڵ� ������ ��� ����� �޴����� �߿��մϴ�.
 * 
 * �Ϲ������� ����� ���ִ� ���ָ� �θ�Ŭ����, ����� �޴� Ŭ������ �ڽ� Ŭ������� �ϰ�,
 * ��ȣ�� "�ڽ� -> �θ�"�� ǥ���մϴ�.(�Ϲ�ȭ�Ѵٰ� �մϴ�.)
 *
 * ��� ������ �ϱ��ؾ��մϴ�.
 * 
 * class �ڽ� extends �θ�{
 * 	����;
 * }
 * 
 * ����� Ư¡��, �ڽ��� �θ��� ��� ����� ��� �����ϴٴ� ���Դϴ�.
 * 
 */

public class A_Extends {
	static class Parent {
		String str = "Parent";
	}

	static class Child extends Parent {
		String str2 = "Child";
	}

	public static void main(String[] args) {
		Child c1 = new Child();

		System.out.println(c1.str);
		System.out.println(c1.str2);
	}
}