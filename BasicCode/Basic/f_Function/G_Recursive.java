package f_Function;

import tools.Input;

/**
 * 
 * ����Լ��� �����θ� ȣ���ϴ� �Լ��Դϴ�.
 * ����Լ��� ����ϴ� ������ ��쿡 ���� �ڵ���̸� ȹ�������� �ٿ��ֱ� ������ ���˴ϴ�.
 *  
 * ���� ���翡�� ������ ���̵� �Լ��Դϴ�. 
 * ���谡 ����� ���� ������, �޸� ������ ��Ʊ� ������ �����ϴ� ������ �ֽ��ϴ�.  
 *
 */

public class G_Recursive {
	public static void main(String[] args) {
		int sum;
		int input = Input.getInt();
		sum = recursiveSum(input);
		System.out.println("���� : " + sum);
		
		int gcd = gcd(input, 36);
		System.out.println("�ִ����� : " + gcd);
		
		int factorial = factorial(input);
		System.out.println("���丮�� : " + factorial);
		
		int fibonacci = fibonacci(input);
		System.out.println("�Ǻ���ġ : " + fibonacci);
	}

	static int recursiveSum(int n) {
		if (n == 1) {
			return 1;
		}
		return n + recursiveSum(n - 1);
	}

	static int gcd(int p, int q) {
		// �ǽ�����(����) : �ִ������Լ��� ���غ��ϴ�.
		return p;
	}

	static int fibonacci(int n) {
		// �ǽ�����(����) : n��° �Ǻ���ġ ������ ���غ��ϴ�.
		return n;
	}

	static int factorial(int n) {
		// �ǽ�����(����) : ���丮���Լ��� �����غ��ϴ�.
		return n;
	}
}

/* ��Ʈ : �Ʒ� �Լ����߿� �����ϰ� ������ �� �ֽ��ϴ�.
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