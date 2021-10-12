package B_Extends;

/**
 * 
 * �߻�Ŭ������ �߻� �޼��带 ���� �� �ֽ��ϴ�.
 * ���� �ν��Ͻ��� ���� �� �����ϴ�.
 * 
 * �߻�Ŭ������ ����ϴ� ������ ������ ��� ���ؼ� �Դϴ�. (�ָ���)
 * ���������� �ۼ��ϰ��� �� ��, ���� �ν��Ͻ��� �ۼ��� �ʿ�� ������, ���� Ŭ�������� ������ �޼��带 ����ϵ��� ������ �� �ֽ��ϴ�.
 *
 */

public class E_Abstract {
	// �߻�Ŭ����
	static abstract class Show {
		abstract void show();
	}

	static class Class1 extends Show {
		void show() {
			System.out.println("Class 1");
		}
	}

	static class Class2 extends Show {
		void show() {
			System.out.println("Class 2");
		}
	}

	public static void main(String[] args) {
		// Show sh = new Show(); // �߻� Ŭ������ �ν��Ͻ��� ������ �� ����.
		Class1 c1 = new Class1();
		Class2 c2 = new Class2();

		c1.show();
		c2.show();
	}
}

// �ǽ����� 1 : �߻� Ŭ������, �߻� �ʵ带 ������ �� �ֳ���?
// �ǽ����� 2 : �߻� Ŭ������, �Ϲ� �޼��带 ���� �� �� �ֳ���?
// �ǽ����� 3 : �߻� �޼��忡, �ٵ� �ۼ��� �� �ֳ���?
// �ǽ����� 4 : �Ϲ� Ŭ������, �߻� �޼��带 �ۼ� �� �� �ֳ���?
// �ǽ����� 5 : static �޼��带 ����� ����� �� �ֳ���?