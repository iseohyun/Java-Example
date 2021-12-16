package a_Class;

/**
 * 
 * 메소드를 사용하기 위해서는 인스턴스를 생성하고, 점(.)연산자를 통해서 호출 할 수 있습니다.
 * 단, static으로 선언된 메서드(class method)는 항상 메모리에 상주하는 메서드이므로,
 * 인스턴스를 굳이 선언하지 않더라도 사용할 수 있습니다.
 *
 */

@SuppressWarnings("static-access")
public class D_Static {
	static class Class1 {
		// instance
		void func1(int i) {
			System.out.println("인스턴스 메소드 : " + i);
		}
		int instanceVar = 20;

		// class
		static void func2(int i) {
			System.out.println("클레스 메소드 : " + i);
		}
		static int classVar = 40;
	}

	public static void main(String[] args) {
		// 일반적인 메소드 사용방법
		// 1. 선언을 한다.
		Class1 c1;
		
		// 2. 인스턴스를 생성한다.
		c1 = new Class1();

		// 3. 함수를 불러 쓴다.
		c1.func1(10);
		System.out.println("인스턴스 필드 : " + c1.instanceVar);
		c1.func2(30);
		System.out.println("클래스 필드 : " + c1.classVar);

		// Static 메소드 사용방법
		// 1. 그냥 쓴다.
		Class1.func2(50);
		System.out.println("클래스 필드 : " + Class1.classVar);
	}
}