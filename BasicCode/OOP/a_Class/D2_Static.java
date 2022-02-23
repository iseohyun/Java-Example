package a_Class;

/**
 * 
 * 메소드를 사용하기 위해서는 인스턴스를 생성하고, 점(.)연산자를 통해서 호출 할 수 있습니다.
 * 단, static으로 선언된 메서드(class method)는 항상 메모리에 상주하는 메서드이므로,
 * 인스턴스를 굳이 선언하지 않더라도 사용할 수 있습니다.
 *
 */

public class D2_Static {
	static class Class1 {
		static void print(int i) {
			System.out.println("출력 : " + i);
		}
	}

	public static void main(String[] args) {
		Class1.print(50);
		Class1.print(100);
	}
}