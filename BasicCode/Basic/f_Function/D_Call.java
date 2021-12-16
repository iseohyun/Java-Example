package f_Function;

/**
 * 
 * 호출 순서를 관찰하기 위한 예제입니다. 함수는 서로 자유롭게 호출 할 수 있습니다. 
 * 정해진 순서는 없습니다.
 * 
 * 	fun1() -> func2 -> func3()
 *
 */

public class D_Call {
	public static void main(String[] args) {
		func1();
	}

	static void func1() {
		System.out.println("1: 시작한다.");
		func2();
		System.out.println("1: 끝난다.");
	}

	static void func2() {
		System.out.println("2: 시작한다.");
		func3();
		System.out.println("2: 끝난다.");
	}

	static void func3() {
		System.out.println("3: 시작한다.");
		// 실습과제 : func1()을 호출한다면 어떤 일이 발생할까?
		System.out.println("3: 끝난다.");
	}
}