package A_BasicSyntax;

import java.util.Scanner;

/**
 * 
 * @author Seohyun Jung
 *	���ڿ��� �Է¹޴� �����Դϴ�.
 *	���ڵ� �˰��� ���ڿ��Դϴ�.
 *	���� ���ڰ� �ƴϰ� ���ڿ��� �ԷµǸ�, �ý����� ������ ���ϴ�.
 *  ������ ����ϴ� ����� ���Ŀ� ���ɴϴ�. (exception)
 *  
 */

public class G2_Scan_String {
	private static Scanner scan;
	public static void main(String[] args){
		String str;
		scan = new Scanner(System.in);
		System.out.print("�ܾ �Է��� �ּ��� : ");
		str = scan.next();
		System.out.println("�Է��� �ܾ� : " + str);
		System.out.println("���ڷ� ��ȯx2 : " + Integer.parseInt(str)*2);
		System.out.println("�Ҽ��� ��ȯ/2 : " + Double.parseDouble(str)/2);
	}
}
