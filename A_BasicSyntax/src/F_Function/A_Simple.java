package F_Function;

/**
 * 
 * 내가 원하는 기능만 툭 떼어서 코드 블록을 만드는 행위를 함수를 만든다고 합니다.
 * 함수를 만들어두면, 내가 필요할 때마다 불러 올 수 있습니다.
 *
 *	초간단 함수 문법 :
 *		void 함수명() {
 *			바디;
 *		}
 */

public class A_Simple {
	public static void main(String[] args) {
		func1();
		func2();
		func1();
		func2();
	}

	static void func1() {
		System.out.println("호출 되었습니다.");
	}

	static void func2() {
		System.out.println("두번 째 함수입니다.");
	}
}

// 실습과제 : fucn3을 만들고, func3을 호출합니다. func3은 "세번 째 함수입니다."를 출력합니다.
// 실습과제 2: fucn4를 만들고, func4를 호출합니다. func4는 func1과 func2를 호출하는 함수입니다.