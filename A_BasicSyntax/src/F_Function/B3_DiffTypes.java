package F_Function;

public class B3_DiffTypes {
	public static void main(String[] args) {
		func1(1);
		func2(1.1f);
		func3("String");
	}

	static void func1(int input) {
		System.out.println("출력 : " + input);
	}

	static void func2(float input) {
		System.out.println("출력 : " + input);
	}

	static void func3(String input) {
		System.out.println("출력 : " + input);
	}
}

// 실습과제 : 문자(char) 1개를 입력받는 함수를 만들어봅니다.
//		예를들어 newFunc('x');가 호출이 되면,
//		"출력 : x"가 출려되도록 합니다.
// 실습과제 2: 만약 대문자가 입력되면 소문자로 바꾸는 기능을 추가해봅니다.
//		예를들어 newFunc('a');가 호출이 되면,
//		"출력 : A"가 출려되도록 합니다.
// 실습과제 3: 인자를 4개 받는 함수를 만들어봅니다. 인자는 char a, int x, char b, int y입니다.
//		함수는 a가 x번, b가 y번이 출력됩니다.
// 예를들어, newFunc3('A', 3, 'B', 5);가 호출이 되면, 아래와 같이 출력됩니다.
// 출력 : AAABBBBB