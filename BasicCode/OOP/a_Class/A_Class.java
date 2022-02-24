package a_Class;

class Class1 {
	int field1;
	int field2;

	void method1() {
	}

	void method2() {
		System.out.println("메서드 호출하기");
	}
}

public class A_Class {
	public static void main(String[] args) {
		Class1 c1;
		c1 = new Class1();

		// 필드 제어
		c1.field1 = 33;
		System.out.println("필드에서 받아온 값 : " + c1.field1);

		c1.method2();
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