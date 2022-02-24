package b_Extends;

/**
 * 
 * 기본적인 Override규칙은 본인이 소유한 method를 호출한다는 것입니다.
 * 
 * 자식타입(기능이 더 많은, 더 큰..)으로 인스턴스를 생성했을 때, 부모타입(기능을 몇 개 안쓰는)으로 호출이 가능하지만, 부모타입(기능이
 * 더 적은, 더 작은..)으로 인스턴스를 생성하고, 자식타입(없는 기능을 쓸수는 없는)으로는 호출이 불가능 합니다.
 *
 * 주의할 점은 본인의 기준은 호출 타입이 아니고, 인스턴스(new)의 타입이 됩니다.
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

		Parent pc = new Child(); // 주의
		pc.display();

		// Child cp = new Parent(); // 호출이 안됨
	}
}