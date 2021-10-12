package B_Extends;

// Super 키워드를 이해하기 위한 예제 입니다.

public class C_Super {
	static class Parent {
		int a = 10;
	}

	static class Child extends Parent {
		int a = 20;

		void display() {
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(super.a);
		}
	}

	public static void main(String[] args) {
		Child ch = new Child();
		ch.display();
	}
}