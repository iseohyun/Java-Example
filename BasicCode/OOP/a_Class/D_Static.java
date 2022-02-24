package a_Class;

/**
 * 
 * static은 메모리를 공유합니다.
 * 단, static으로 선언된 메서드(class method)는 항상 메모리에 상주하는 메서드이므로,
 * 인스턴스를 굳이 선언하지 않더라도 사용할 수 있습니다.
 *
 */

public class D_Static {
	static class Class1 {
		static int seq = 1;
		int id;

		Class1() {
			id = seq++;
		}
	}

	public static void main(String[] args) {
		Class1 a1 = new Class1();
		System.out.println("id : " + a1.id);

		Class1 a2 = new Class1();
		System.out.println("id : " + a2.id);

		Class1 a3 = new Class1();
		System.out.println("id : " + a3.id);
	}
}