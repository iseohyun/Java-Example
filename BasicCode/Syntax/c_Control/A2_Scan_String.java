package c_Control;

import java.util.Scanner;

/**
 * 
 *	���ڿ��� �Է¹޴� �����Դϴ�.
 *	���ڵ� �˰��� ���ڿ��Դϴ�.
 *	���� ���ڰ� �ƴϰ� ���ڿ��� �ԷµǸ�, �ý����� ������ ���ϴ�.
 *  ������ ����ϴ� ����� ���Ŀ� ���ɴϴ�. (exception)
 *  
 */

public class A2_Scan_String {
	private static Scanner scan;

	public static void main(String[] args) {
		String str;
		scan = new Scanner(System.in);
		System.out.print("�Է��� �ּ��� : ");
		str = scan.next();
		System.out.println("�Է��� �ܾ� : " + str);
		System.out.println("���ڷ� ��ȯ x 2 : " + Integer.parseInt(str) * 2);
		System.out.println("�Ҽ��� ��ȯ �� 2 : " + Double.parseDouble(str) / 2);
	}
}

// �ǽ����� 1: ���ڸ� �Է��� ���ϴ�.
// �ǽ����� 2: ���ڸ� �Է��� ���ϴ�.
