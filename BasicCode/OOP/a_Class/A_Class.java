package a_Class;

class Class1 {
	int field1;
	int field2;

	void method1() {
	}

	void method2() {
		System.out.println("�޼��� ȣ���ϱ�");
	}
}

public class A_Class {
	public static void main(String[] args) {
		Class1 c1;
		c1 = new Class1();

		// �ʵ� ����
		c1.field1 = 33;
		System.out.println("�ʵ忡�� �޾ƿ� �� : " + c1.field1);

		c1.method2();
	}
}

// �ǽ����� 1 : Sum(int a, int b)�� �����, a + b�� �����ϴ� �Լ��� ��������.
// �ǽ����� 2 : ���ο� Ŭ����(Friend)�� �����, String name�� �ʵ�� ������ �մϴ�.
//	setName(String newName)�� name�� �̸��� �����ϴ� �޼����Դϴ�.
//	getName() �� ���� �̸��� ��ȯ�ϴ� �޼����Դϴ�.
// �ǽ����� 3 : ���ο� Ŭ����(Car)�� �����, int speed�� �ʵ�� ������ �մϴ�.
//	addSpeed(int accel)�� speed�� accel��ŭ �����ϴ� �޼����Դϴ�.
//	stop() �� ���� speed�� 0���� ����� �޼��� �Դϴ�.
// �ǽ����� 4 : ���ο� Ŭ����(Account)�� �����, int balance(�ܱ�)�� ����ϴ�.
//	deposit(�Ա�), withdraw(���) �޼��带 ����ϴ�. ��, �ܱ��� 0 �̸����� ������ �� �����ϴ�.