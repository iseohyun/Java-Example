package C_CtrlStatement;

import A_BasicSyntax.Input;

/**
 * 
 * @author Seohyun Jung
 *
 *	�ݵ�� �ܿ��� �� ����:
 *		if(�Ǵܹ�){�ٵ�;}
 *
 *		if(�Ǵܹ�){�ٵ�;}
 *		else{�ٵ�2;}
 *
 *		if(�Ǵܹ�){�ٵ�;}
 *		else if{�ٵ�2;}
 *		else{�ٵ�3;}
 *
 */

public class A_If {
	public static void main(String[] args) {
		int i = Input.getNum();
		System.out.println("�Է��� ���ڴ� " + i + "�Դϴ�.");
		if (i > 5) {
			System.out.println("5���� Ů�ϴ�.");
		}

		if (i > 3) {
			System.out.println("3���� Ů�ϴ�.");
		}

		if (i < 5) {
			System.out.println("5���� �۽��ϴ�.");
		}
	}
}
