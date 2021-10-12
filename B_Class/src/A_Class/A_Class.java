package A_Class;

/**
 * 		Ŭ������ �ۼ�, ȣ�� ������ �ݵ�� �ϱ��ؾ� �մϴ�.
 *		���������� class Ŭ������{
 *			�ʵ�1;
 *			�ʵ�2;
 *			�ʵ�3; ...
 *			�޼���1;
 *			�޼���2;
 *			�޼���3; ...
 *		}
 *
 *	Ŭ������ OOP(Object Oriant Programing;��ü����)�� �ٽ��Դϴ�.
 *	Ŭ������ �ʵ�(����)�� �޼���(�Լ�)�� �����Դϴ�.
 *
 */

class Class1 {
	int field;
	
	void method1() {
		System.out.println("�޼��� ȣ���ϱ�");
	};
	
	void method2(int value) {
		field = value;
	}
}

@SuppressWarnings("unused")
public class A_Class {
	public static void main(String[] args) {
		// ȣ���ϱ�
		Class1 c1;
		// �ν��Ͻ� �����
		c1 = new Class1();

		// ȣ���ϱ� + �ν��Ͻ� �����
		Class1 c2 = new Class1();
		
		// �޼��� ����ϱ�
		c1.method1();
		
		// �ʵ忡 �����ϱ�
		c1.field = 33;
		
		// �ʵ带 ����ϱ�
		int ret = c1.field;
		System.out.println("�ʵ忡�� �޾ƿ� �� : " + ret);
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