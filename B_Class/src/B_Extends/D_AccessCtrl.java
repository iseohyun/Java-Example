package B_Extends;

/**
 * 
 * 접근제어자
 *
 *	4가지 접근제어 방식이 있습니다.
 *
 *	private			비공개
 *	protected		상속에만 공개
 *	(작성하지 않음)		패키지 안에서 완전 공개
 *	public			외부에 완전 공개
 *
 */

@SuppressWarnings("unused")
public class D_AccessCtrl {
	static class Parent {
		private int Private = 10;
		protected int Protected = 20;
		int P_Private = 30;	// Package_Private : 패키지 않에서 자유롭게 사용가능
		public int Public = 40;
	}

	static class Child extends Parent {
		void display() {
			// System.out.println(Private);
			System.out.println(Protected);
			System.out.println(P_Private);
			System.out.println(Public);
		}
	}

	public static void main(String[] args) {
		Child ch = new Child();
		ch.display();
	}
}

// 실습과제 : (// System.out.println(Private);에서) 주석을 지우고 실행해 봅니다.
// 실습과제 2: main에 생성한, ch가 사용가능한 멤버를 확인해봅니다.
//		확인하는 방법은 ch.을 입력했을 때, Popup 메뉴를 확인하면 됩니다.