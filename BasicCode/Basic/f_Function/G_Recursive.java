package f_Function;

import tools.Input;

/**
 * 
 * 재귀함수는 스스로를 호출하는 함수입니다.
 * 재귀함수를 사용하는 이유는 경우에 따라서 코드길이를 획기적으로 줄여주기 때문에 사용됩니다.
 *  
 * 많은 교재에서 나오는 고난이도 함수입니다. 
 * 설계가 어려운 점도 있지만, 메모리 관리가 어렵기 때문에 기피하는 경향이 있습니다.  
 *
 */

public class G_Recursive {
	public static void main(String[] args) {
		int sum;
		int input = Input.getInt();
		sum = recursiveSum(input);
		System.out.println("누계 : " + sum);
		
		int gcd = gcd(input, 36);
		System.out.println("최대공약수 : " + gcd);
		
		int factorial = factorial(input);
		System.out.println("팩토리얼 : " + factorial);
		
		int fibonacci = fibonacci(input);
		System.out.println("피보나치 : " + fibonacci);
	}

	static int recursiveSum(int n) {
		if (n == 1) {
			return 1;
		}
		return n + recursiveSum(n - 1);
	}

	static int gcd(int p, int q) {
		// 실습과제(고난도) : 최대공약수함수를 구해봅니다.
		return p;
	}

	static int fibonacci(int n) {
		// 실습과제(고난도) : n번째 피보나치 수열을 구해봅니다.
		return n;
	}

	static int factorial(int n) {
		// 실습과제(고난도) : 팩토리얼함수를 구현해봅니다.
		return n;
	}
}

/* 힌트 : 아래 함수들중에 적절하게 수정할 수 있습니다.
	static int ?????(int n) {
		if (n == 1)
			return 1;
		else
			return n * ?????(n - 1);
	}

	static int ?????(int p, int q) {
		if (q == 0)
			return p;
		else
			return ?????(q, p % q);

	}

	static int ?????(int n) {
		if (n < 2)
			return n;
		else
			return ?????(n - 1) + ?????(n - 2);
	}	
*/