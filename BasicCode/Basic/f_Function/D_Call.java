package f_Function;

/**
 * 
 * ȣ�� ������ �����ϱ� ���� �����Դϴ�. �Լ��� ���� �����Ӱ� ȣ�� �� �� �ֽ��ϴ�. 
 * ������ ������ �����ϴ�.
 * 
 * 	fun1() -> func2 -> func3()
 *
 */

public class D_Call {
	public static void main(String[] args) {
		func1();
	}

	static void func1() {
		System.out.println("1: �����Ѵ�.");
		func2();
		System.out.println("1: ������.");
	}

	static void func2() {
		System.out.println("2: �����Ѵ�.");
		func3();
		System.out.println("2: ������.");
	}

	static void func3() {
		System.out.println("3: �����Ѵ�.");
		// �ǽ����� : func1()�� ȣ���Ѵٸ� � ���� �߻��ұ�?
		System.out.println("3: ������.");
	}
}