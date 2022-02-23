package b_Operation;

import tools.Input;

/**
 * 
 * 대입연산자 : 대입연산자1과 대입연산자2는 결과가 언제나 같습니다.
 *
 */

public class B_Equal {
	public static void main(String[] args) {
		int a = Input.getInt();
		int res1, res2;

		res1 = res2 = 1;
		res1 = res1 + a; // 대입연산자1
		res2 += a; // 대입연산자2
		System.out.println("1 : " + res1 + " / " + res2);

		res1 = res2 = 10;
		res1 = res1 - a; // 대입연산자1
		res2 -= a; // 대입연산자2
		System.out.println("2 : " + res1 + " / " + res2);

		res1 = res2 = 10;
		res1 = res1 % a; // 대입연산자1
		res2 %= a; // 대입연산자2
		System.out.println("3 : " + res1 + " / " + res2);
		
		res1 = res2 = 10;
		res1 = res1 << a; // 대입연산자1
		res2 <<= a; // 대입연산자2
		System.out.println("3 : " + res1 + " / " + res2);
	}
}