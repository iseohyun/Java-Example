package b_Extends;

/**
 * 
 * 인터페이스 활용
 * 
 * 서로 다른 객체가 있다하더라도, 동일 한 기능을 가지고 있다면, 하나의 Interface만 생성하여 둘 다 헨들링 할 수 있다.
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