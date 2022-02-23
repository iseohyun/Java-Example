package a_Class;

/**
 * 
 * 인터페이스: 변수가 없고(상수는 있음), 메서드로만 구성된 특수한 클래스
 * 
 *	Java에서는 class를 다중 상속 할 수 없다. 단 interface는 다중 상속이 가능합니다.
 *
 *	인터페이스가 가질 수 있는 메서드는 3가지 타입이 있습니다. 암기가 필요합니다.
 *		default	: 가장 일반적인 형태
 *		static	: 메모리 상주형(인스턴스 없이 사용이 가능)
 *		abstract: 껍데기만 있음(재정의 필요)
 *
 */


public class G_Interface3 {
	interface Inter1 {
		void abstract1();
	}

	public static void main(String[] args) {
		Inter1 i1 = new Inter1() {
			@Override
			public void abstract1() {
				System.out.println("Abstract!");
				
			}
		};
		
		i1.abstract1();
	}
}

// 실습과제 : 인자를 2개 전달해서 그중 큰 값을 출력하는 인터페이스를 작성해봅니다.