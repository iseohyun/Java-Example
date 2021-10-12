package A_Class;

/**
 * 		클래스의 작성, 호출 형식은 반드시 암기해야 합니다.
 *		접근제어자 class 클래스명{
 *			필드1;
 *			필드2;
 *			필드3; ...
 *			메서드1;
 *			메서드2;
 *			메서드3; ...
 *		}
 *
 *	클레스는 OOP(Object Oriant Programing;객체지향)의 핵심입니다.
 *	클레스는 필드(변수)와 메서드(함수)의 모임입니다.
 *
 */

class Class1 {
	int field;
	
	void method1() {
		System.out.println("메서드 호출하기");
	};
	
	void method2(int value) {
		field = value;
	}
}

@SuppressWarnings("unused")
public class A_Class {
	public static void main(String[] args) {
		// 호출하기
		Class1 c1;
		// 인스턴스 만들기
		c1 = new Class1();

		// 호출하기 + 인스턴스 만들기
		Class1 c2 = new Class1();
		
		// 메서드 사용하기
		c1.method1();
		
		// 필드에 저장하기
		c1.field = 33;
		
		// 필드를 사용하기
		int ret = c1.field;
		System.out.println("필드에서 받아온 값 : " + ret);
	}
}

// 실습과제 1 : Sum(int a, int b)를 만들고, a + b를 리턴하는 함수를 만들어보세요.
// 실습과제 2 : 새로운 클래스(Friend)를 만들고, String name을 필드로 갖도록 합니다.
//	setName(String newName)은 name에 이름을 저장하는 메서드입니다.
//	getName() 은 현재 이름을 반환하는 메서드입니다.
// 실습과제 3 : 새로운 클래스(Car)를 만들고, int speed를 필드로 갖도록 합니다.
//	addSpeed(int accel)은 speed가 accel만큼 증가하는 메서드입니다.
//	stop() 은 현재 speed를 0으로 만드는 메서드 입니다.
// 실습과제 4 : 새로운 클래스(Account)를 만들고, int balance(잔금)를 만듬니다.
//	deposit(입금), withdraw(출금) 메서드를 만듭니다. 단, 잔금은 0 미만으로 내려갈 수 없습니다.