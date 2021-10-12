package B_Extends;

/**
 * 
 * 추상클래스는 추상 메서드를 가질 수 있습니다.
 * 또한 인스턴스를 만들 수 없습니다.
 * 
 * 추상클래스를 사용하는 목적은 구조를 잡기 위해서 입니다. (주목적)
 * 계층구조로 작성하고자 할 때, 직접 인스턴스를 작성할 필요는 없지만, 하위 클래스들이 일정한 메서드를 사용하도록 강제할 수 있습니다.
 *
 */

public class E_Abstract {
	// 추상클래스
	static abstract class Show {
		abstract void show();
	}

	static class Class1 extends Show {
		void show() {
			System.out.println("Class 1");
		}
	}

	static class Class2 extends Show {
		void show() {
			System.out.println("Class 2");
		}
	}

	public static void main(String[] args) {
		// Show sh = new Show(); // 추상 클래스는 인스턴스를 생성할 수 없음.
		Class1 c1 = new Class1();
		Class2 c2 = new Class2();

		c1.show();
		c2.show();
	}
}

// 실습과제 1 : 추상 클래스에, 추상 필드를 생성할 수 있나요?
// 실습과제 2 : 추상 클래스에, 일반 메서드를 생성 할 수 있나요?
// 실습과제 3 : 추상 메서드에, 바디를 작성할 수 있나요?
// 실습과제 4 : 일반 클래스에, 추상 메서드를 작성 할 수 있나요?
// 실습과제 5 : static 메서드를 만들고 사용할 수 있나요?