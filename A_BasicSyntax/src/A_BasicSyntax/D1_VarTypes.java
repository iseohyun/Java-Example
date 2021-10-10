package A_BasicSyntax;

/**
 * 
 *	 숫자와 문자를 구분하는 이유는 표현방식의 차이가 있는 것이고,
 *	정수와 소수는 저장방식의 차이가 있습니다.
 *	 String은 예약어가 아니고, 클래스라는 것이지만, 일단은 타입이라고 암기하시는 것이 좋겠습니다.
 *
 *	반드시 외워야 할 사항
 *		참/거짓
 *					: boolean
 *		숫자
 *			정수		: byte, short, int, long 
 *			소수		: float, double
 *		문자
 *			문자		: char
 *			문자열	: String
 *  
 */

public class D1_VarTypes {
	public static void main(String[] args) {
		boolean a = true;
		System.out.println("Boolean : " + a);
		
		byte b = 1;
		System.out.println("Byte: " + b);
		
		short s = 2;
		System.out.println("Short: " + s);
		
		int i = 4;
		System.out.println("Integer: " + i);
		
		long l = 8;
		System.out.println("Long: " + l);
		
		// 주의 : float를 표시할 때 숫자 뒤에 f를 붙여줍니다.
		// f가 없으면, double로 인식합니다.
		float f = 5.5f;
		System.out.println("Float: " + f);
		
		double d = 6.5;
		System.out.println("Double: " + d);
		
		char c = 'c'; 
		System.out.println("Character: " + c);

		String str = "text";
		System.out.println("String: " + str);
	}
}

// 실습과제 1: 모든 내용을 삭제하고, 정수타입으로 변수를 새로 선언하고 99999를 대입하세요. (변수명은 자유롭게 설정하세요)
// 실습과제 2: 모든 내용을 삭제하고, 소수타입으로 변수를 선언하고 3.14를 대입하세요. (변수명은 자유롭게 설정하세요)