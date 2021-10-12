package B_Extends;

/**
 * 
 * 변수는 오버라이드 되더라도 사라지는 것은 아닙니다. 
 * add1의 메서드를 통해서 어떤 변수가 영향을 받는지 확인할 수 있습니다.
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