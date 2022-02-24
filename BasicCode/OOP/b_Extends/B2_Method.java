package b_Extends;

/**
 * 
 * �⺻���� Override��Ģ�� ������ ������ method�� ȣ���Ѵٴ� ���Դϴ�.
 * 
 * �ڽ�Ÿ��(����� �� ����, �� ū..)���� �ν��Ͻ��� �������� ��, �θ�Ÿ��(����� �� �� �Ⱦ���)���� ȣ���� ����������, �θ�Ÿ��(�����
 * �� ����, �� ����..)���� �ν��Ͻ��� �����ϰ�, �ڽ�Ÿ��(���� ����� ������ ����)���δ� ȣ���� �Ұ��� �մϴ�.
 *
 * ������ ���� ������ ������ ȣ�� Ÿ���� �ƴϰ�, �ν��Ͻ�(new)�� Ÿ���� �˴ϴ�.
 */

public class B2_Method {
	static class Parent {
		void display() {
			System.out.println("Class Top");
		}
	}

	static class Child extends Parent {
		void display() {
			System.out.println("Class 2");
		}
	}

	public static void main(String[] args) {
		Parent pa = new Parent();
		pa.display();

		Child ch = new Child();
		ch.display();

		Parent pc = new Child(); // ����
		pc.display();

		// Child cp = new Parent(); // ȣ���� �ȵ�
	}
}