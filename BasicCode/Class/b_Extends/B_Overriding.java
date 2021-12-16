package b_Extends;

/**
 * 
 * 	���� �ʵ���� ���� ���
 * 
 * ���������� �θ�� �ڽĿ��� ���� str�� ����ϰ� �ֽ��ϴ�.
 * ������� ���� ȣ���ߴ����� ���� �޶����ϴ�.
 *
 */

public class B_Overriding {
	static class Parent {
		String str = "Parent";
	}

	static class Child extends Parent {
		String str = "Child";
	}

	public static void main(String[] args) {
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		System.out.println(p1.str);
		System.out.println(c1.str);
	}
}

// �ǽ����� : String str = "Child"; ��� String str;�� �Է��ϰ� �����غ�����.