package A_Class;

/**
 * 
 * 내부클래스
 *	클래스는 어디에서도 작성될 수 있고, 어디에도 사용될 수 있습니다.
 *	가장 바깥쪽에 작성된 클래스일수록 더 넓게 사용될 수 있습니다.
 *	반대로 안쪽에 설계된 클래스는 참조하는데 많은 제약이 생깁니다.
 *
 *	내부클래스를 사용하는 이유는 다른 클래스와 충돌을 피하고 싶거나, 일부러 감추고 싶어서 입니다.
 *
 */

public class B_InnerClass {
	static class InnerClass1 {
		int inner = 1;

		public void print() {
			System.out.println("Inner 1 :" + inner);
		}
	}

	public static void main(String[] strs) {
		class InnerClass2 {
			int inner2 = 2;

			public void print() {
				System.out.println("Inner 2 :" + inner2);
			}
		}

		InnerClass1 in1 = new InnerClass1();
		in1.print();

		InnerClass2 in2 = new InnerClass2();
		in2.print();

		func1();
	}

	static void func1() {
		System.out.println("외부 함수에서는 InnerClass2가 보이지 않습니다.");
		InnerClass1 in1 = new InnerClass1();
		in1.print();

		// InnerClass2 in2 = new InnerClass2();
		// in2.print();
	}
}

// 실습과제 : 주석이 없으면 에러가 나는 것을 확인합니다.
// 실습과제 2: InnerClass2에 InnerClass3을 생성합니다.
//	InnerClass2는 InnerClass3 in3을 필드로 갖습니다.
//	main에서 in2.in3.inner3 = 3;을 실행하고, 잘 저장되었는지 확인합니다.
// 실습과제 3: InnerClass2에 InnerClass3을 생성합니다.
//	InnerClass1는 InnerClass4 in4을 필드로 갖습니다.
//	func1에서 in1.in4.inner4 = 4;을 실행하고, 잘 저장되었는지 확인합니다.