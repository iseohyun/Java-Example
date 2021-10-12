package A_Class;

/**
 * 
 * This연산자는 class내부에서 class가 가진 변수와 인자를 구별하기 위해 사용됩니다.
 * 애초에 인자명과 변수명을 다르게 하면되지 않느냐고 생각 할 수도 있겠으나, 
 * 많은 컴파일러에서 함수의 프로토타입을 그대로 가져와 사용하다보니, 가독성을 위해서 중복된 변수명을 쓰는경우가 많습니다.
 * 이 때 중복된 변수를 구별하기 위해서 사용합니다.
 *
 */

@SuppressWarnings("all")
public class E_This {
	static class Class1 {
		int var = 10;

		void func1(int var) {
			this.var = var;
		}

		void func2(int var) {
			var = var;
		}
	}

	public static void main(String[] args) {
		Class1 c1 = new Class1();

		System.out.println("1 : " + c1.var);

		c1.func1(20);
		System.out.println("2 : " + c1.var);

		c1.func2(30);
		System.out.println("3 : " + c1.var);
	}
}