package b_Extends;

/**
 * 
 * �������̽� Ȱ��
 * 
 * ���� �ٸ� ��ü�� �ִ��ϴ���, ���� �� ����� ������ �ִٸ�, �ϳ��� Interface�� �����Ͽ� �� �� ��鸵 �� �� �ִ�.
 *
 */

public class F2_Usage {
	interface Inter1 {
		public abstract void print();
	}

	static class Class1 implements Inter1 {
		public void print() {
			System.out.println("Class 1");
		}
	}

	static class Class2 implements Inter1 {
		public void print() {
			System.out.println("Class 2");
		}
	}

	public static void main(String[] args) {
		Inter1 i1 = new Class1();
		i1.print();

		i1 = new Class2();
		i1.print();
	}
}