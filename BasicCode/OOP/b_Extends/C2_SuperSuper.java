package b_Extends;

/**
 * 
 * 자신의 상위의 상위를 한번에 호출하는 방법은 없지만, 상위 함수를 호출하는 상위함수를 호출하므로써 해결 할 수 있습니다.
 *
 */

@SuppressWarnings("unused")
public class C2_SuperSuper {
	static class Super1 {
		Super1() {
			System.out.println("Super 1 : init");
		}
	}

	static class Super2 extends Super1 {
		Super2() {
			super();
			System.out.println("Super 2 : init");
		}
	}

	static class Super3 extends Super2 {
		Super3() {
			super();
			System.out.println("Super 3 : init");
		}
	}

	public static void main(String[] args) {
		Super3 su1 = new Super3();
	}
}

// 실습과제 : super()와 println의 순서를 바꿔서 출력 순서를 비교해 봅니다.