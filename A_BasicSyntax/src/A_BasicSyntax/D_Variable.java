package A_BasicSyntax;

/**
 * 
 * @author Seohyun Jung
 *
 *	출력을 변수를 이용하여 변경 할 수 있습니다. 변수는 문자와 숫자로 구분됩니다.
 *	 숫자는 정수와 소수로 구분됩니다.
 *	 문자는 문자와 문자열로 구분됩니다.
 *
 */

public class D_Variable {
	public static void main(String[] args) {
		// TODO : 변수를 변경해봅시다.
		String person = "나";
		String name = "정서현";
		int birthYear = 2000;
		int age = 20;
		double tall = 174.9;			//float tall = 174.9f;
		String hobby = "농구";
		String dream = "최고의 프로그래머";
		
		System.out.println(person + "의 이름은 " + name + "입니다.");
		System.out.println(person + "는 " + birthYear + "년에 태어났고, " + age + "살 입니다.");
		System.out.println(person + "의 키는 " + tall + "센치 입니다.");
		System.out.println(person + "의 취미는 " + hobby + " 입니다.");
		System.out.println(person + "의 꿈은 " + dream + "가 되는 것입니다.");
		
		System.out.println("\n"+ person + "는 " + (2021 - age + 1) + "년에 태어났고, " + age + "살 입니다.");
	}
}
