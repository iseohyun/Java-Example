package A_Class;

/**
 * 
 * 생성자 :
 * 	클래스가 생성될 때, 실행되는 코드입니다. 코딩 문법은 class명과 동일한 함수입니다.
 * 예를들어 class1의 생성자는 class1()입니다.
 * 
 * 클래스를 작성하는 것은 설계도와 같습니다. 즉, 설계도를 작성해도 실제로 생성된 것은 아무것도 없다는 뜻입니다.
 * 선언을 한다는 의미는 컴퓨터에게 사용할 수 도 있다는 것을 알려주는 행위입니다. 역시 아무런 행동도 하지 않습니다.
 * 메모리에 올라가는 순간, 실제로 존재하는 무엇인가가 됩니다. 우리는 이렇게 생성된 무엇인가를 인스턴스라고 부릅니다.
 *
 */

@SuppressWarnings("unused")
public class C_Initialize {
	static class Class1 {
		Class1() {
			System.out.println("생성자 호출");
		}
		Class1(int i) {
			System.out.println("숫자 : " + i);
		}

		Class1(char c) {
			System.out.println("문자 : " + c);
		}
	}

	public static void main(String[] args) {
		
		System.out.println("클래스를 선언합니다.");
		Class1 c0;
		
		System.out.println("클래스를 선언하고 인스턴스를 생성합니다..");
		Class1 c1 = new Class1();
		Class1 c2 = new Class1(1);
		Class1 c3 = new Class1('a');
	}
}

// 실습과제 : class2를 생성하고, 생성자를 생성합니다. 생성자는 "호출되었습니다"를 출력합니다.
// 실습과제 : 문자열을 입력받아 출력하는 생성자를 추가합니다.