package a_BasicSyntax;

/**
 * 
 *	반드시 외워야 할 내용 :
 *		시작 함수는 무조건 public static void main(String[] args)입니다.
 *		반드시 외우셔야 앞으로 진행이 가능합니다. 
 *
 *		추가) 선생님! args는 변경 가능한데요?
 *		args는 ARGument String(문자열 인자)라는 뜻으로, 정해진 것은 아니지만 전 세계가 공통적으로 쓰고 있으므로
 *		소통을 위해서 통일하는 것이 좋겠습니다.
 *
 *		규칙 1 : 한 줄에는 하나의 명령만 입력합니다.
 *		규칙 2 : 명령이 끝나면 반드시 세미콜론(;)으로 마무리한다.
 *		규칙 3 : 모든 괄호(소괄호(), 중괄호{}, 대괄호[]) 및 따옴표("")는 열었으면, 반드시 닫는다.
 *		규칙 4 : 중괄호를 열었다면, 반드시 들여쓰기(Tab)을 합니다.(가독성이 좋아집니다.)
 *		규칙 5 : 대소문자를 반드시 구분합니다.
 *
 */

public class A_HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}

// 실습과제 : 모든 내용을 삭제하고, "Hello Class!"를 출력해 보세요.