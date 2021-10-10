package C_CtrlStatement;

import A_BasicSyntax.Input;

/**
 * 
 * switch문법 :
 * 	switch(조건이 될 변수) {
 * 		case 숫자:
 * 			바디;
 * 			break; (경우에 따라 생략가능)
 * 		case 숫자:
 *        ...
 *        ... (원하는 만큼 case 추가)
 *      default:
 *  }
 *
 *	switch문은 if문과 내부적으로 100% 같은 동작을 수행합니다. 가독성을 좋게 하기 위해서 사용하는 문법입니다.
 *
 */
public class C_Switch {
	public static void main(String[] args) {
		int a = Input.getInt();

		switch(a){
			case 1:
				System.out.println("하나");
				break;
			case 2:
				System.out.println("둘");
			case 3:
				System.out.println("셋");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
		}
	}
}

// 실습과제 1: 1, 2, 3, 4를 각각 입력해봅니다.
// 실습과제 2: 1을 입력했을 때, "하아아나"가 출력되도록 수정해 봅니다.
// 실습과제 3: 2를 입력했을 때, "둘"이 출력되도록 코드를 수정해 봅니다.
// 실습과제 4: 4를 입력했을 때, "넷"이 출력되도록 코드를 수정해 봅니다.
// 실습과제 5(중난도): 위 코드와 똑같이 동작하는 코드를 if와 elseif를 이용하여 작성해봅니다.
// 실습과제 6(고난도): 각 문자가 16진수로 출력되도록 변경해 봅니다. 
// 		0~9까지 입력하면 0~9가 출력되고, A=10, B=11, C=12, D=13, E=14, F=15가 출력되도록 switch문을 구성하세요.
//		char a = Input.getChar(); // 문자를 입력받습니다.