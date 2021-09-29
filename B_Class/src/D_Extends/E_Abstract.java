package D_Extends;

public class E_Abstract {
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