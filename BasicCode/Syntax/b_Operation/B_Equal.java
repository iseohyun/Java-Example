package b_Operation;

import tools.Input;

/**
 * 
 * ���Կ����� : ���Կ�����1�� ���Կ�����2�� ����� ������ �����ϴ�.
 *
 */

public class B_Equal {
	public static void main(String[] args) {
		int a = Input.getInt();
		int res1, res2;

		res1 = res2 = 1;
		res1 = res1 + a; // ���Կ�����1
		res2 += a; // ���Կ�����2
		System.out.println("1 : " + res1 + " / " + res2);

		res1 = res2 = 10;
		res1 = res1 - a; // ���Կ�����1
		res2 -= a; // ���Կ�����2
		System.out.println("2 : " + res1 + " / " + res2);

		res1 = res2 = 10;
		res1 = res1 % a; // ���Կ�����1
		res2 %= a; // ���Կ�����2
		System.out.println("3 : " + res1 + " / " + res2);
		
		res1 = res2 = 10;
		res1 = res1 << a; // ���Կ�����1
		res2 <<= a; // ���Կ�����2
		System.out.println("3 : " + res1 + " / " + res2);
	}
}