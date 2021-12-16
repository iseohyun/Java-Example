package a_Class;

/**
 * 
 * ����Ŭ���� : Inner Class
 *
 */

//�Ϲ� Ŭ����
class OuterClass {
	int outer = 0;
}

public class B_InnerClass {
	//����Ŭ����
	static class InnerClass1 {
		int inner = 1;

		public void print() {
			System.out.println("Inner 1 :" + inner);
		}
	}

	public static void main(String[] strs) {
		class InnerClass2 {
			int inner2 = 2;

			public void print() {
				System.out.println("Inner 2 :" + inner2);
			}
		}

		InnerClass1 in1 = new InnerClass1();
		in1.print();

		InnerClass2 in2 = new InnerClass2();
		in2.print();

		func1();
	}

	static void func1() {
		System.out.println("�ܺ� �Լ������� InnerClass2�� ������ �ʽ��ϴ�.");
		InnerClass1 in1 = new InnerClass1();
		in1.print();

		// InnerClass2 in2 = new InnerClass2();
		// in2.print();
	}
}

// �ǽ����� : �ּ��� ������ ������ ���� ���� Ȯ���մϴ�.
// �ǽ����� 2: InnerClass2�� InnerClass3�� �����մϴ�.
//	InnerClass2�� InnerClass3 in3�� �ʵ�� �����ϴ�.
//	main���� in2.in3.inner3 = 3;�� �����ϰ�, �� ����Ǿ����� Ȯ���մϴ�.
// �ǽ����� 3: InnerClass2�� InnerClass3�� �����մϴ�.
//	InnerClass1�� InnerClass4 in4�� �ʵ�� �����ϴ�.
//	func1���� in1.in4.inner4 = 4;�� �����ϰ�, �� ����Ǿ����� Ȯ���մϴ�.