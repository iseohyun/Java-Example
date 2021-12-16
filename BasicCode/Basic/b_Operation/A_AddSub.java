package b_Operation;

public class A_AddSub {
	public static void main(String[] args) {
		int a = 100, b;
		b = tools.Input.getInt();
		
		System.out.println("더하기 = " + (a + b));
		System.out.println("빼기 = " + (a - b));
		System.out.println("곱하기 = " + (a * b));
		System.out.println("나누기(몫) = " + (a / b));
		System.out.println("나누기(나머지) = " + (a % b));
	}
}

// 실습과제 1 : 나누기(몫)가 10이 되도록 입력을 해보십시오.
// 실습과제 2 : 나누기(나머지)가 16이 되도록 입력을 해보십시오.
// 실습과제 3(고난도) : 나누기(나머지)가 16이 되는 모든 숫자를 찾아보십시오.