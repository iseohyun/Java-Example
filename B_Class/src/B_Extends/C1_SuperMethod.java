package B_Extends;

/**
 * 
 * ������ �������̵� �Ǵ��� ������� ���� �ƴմϴ�. 
 * add1�� �޼��带 ���ؼ� � ������ ������ �޴��� Ȯ���� �� �ֽ��ϴ�.
 *
 */

public class C1_SuperMethod {
	static class Parent {
		int a = 10;

		void add1() {
			a++;
		}
	}

	static class Child extends Parent {
		int a;

		Child(int n) {
			this.a = n;
		}

		void display() {
			System.out.println("Parent : " + super.a + " /Child : " + this.a);
			super.add1();
			System.out.println("Parent : " + super.a + " /Child : " + this.a);
		}
	}

	public static void main(String[] args) {
		Child ch = new Child(50);
		
		System.out.println(" 1 >> ");
		ch.display();
		
		ch.add1();
		
		System.out.println(" 2 >> ");
		ch.display();
	}
}