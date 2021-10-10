package A_BasicSyntax;

/**
 * 
 *	println은 자바에서 가장 많이 쓰는 출력포멧입니다.
 *	그 외에 print, printf가 있습니다.
 * 
 *	print는 출력 후에 줄바꿈(line:ln)을 하지 않습니다.
 *	printf는 f(Format)에 맞추어서 출력합니다.
 *	굳이 외우실 필요는 없고, println을 print로 바꾸었을 때, 어떻게 변화하는지 관찰해 보고 넘어가십시오.
 *
 */

public class C_Print {
	public static void main(String[] args) {
		System.out.println("나의 이름은 홍길동입니다.");
		System.out.println("나는 2000년에 태어났고, 20살 입니다.");
		System.out.println("나의 키는 180.1센치 입니다.");
		System.out.println("나의 취미는 농구 입니다.");
		System.out.println("나의 꿈은 최고의 프로그래머가 되는 것입니다.");
	}
}

// 실습과제 : 내 소개를 해봅시다.