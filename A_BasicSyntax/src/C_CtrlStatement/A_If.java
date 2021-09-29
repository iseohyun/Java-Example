package C_CtrlStatement;

import A_BasicSyntax.Input;

/**
 * 
 * @author Seohyun Jung
 *
 *	반드시 외워야 할 문법:
 *		if(판단문){바디;}
 *
 *		if(판단문){바디;}
 *		else{바디2;}
 *
 *		if(판단문){바디;}
 *		else if{바디2;}
 *		else{바디3;}
 *
 */

public class A_If {
	public static void main(String[] args) {
		int i = Input.getNum();
		System.out.println("입력한 숫자는 " + i + "입니다.");
		if (i > 5) {
			System.out.println("5보다 큽니다.");
		}

		if (i > 3) {
			System.out.println("3보다 큽니다.");
		}

		if (i < 5) {
			System.out.println("5보다 작습니다.");
		}
	}
}
