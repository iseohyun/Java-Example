package c_Control;

import tools.Input;

/**
 * 
 *	if문법:
 *		if(판단문){바디;}
 *
 *		if(판단문){바디;}
 *		else{바디2;}
 *
 *		if(판단문){바디;}
 *		else if{바디2;}
 *		else{바디3;}
 *
 **** 제어 문법들은 모든 문법을 반드시 외워야 합니다.
 *
 */

public class A_If {
	public static void main(String[] args) {
		int i = Input.getInt();
		System.out.println("입력한 숫자는 " + i + "입니다.");
		if (i > 5) {
			System.out.println("5보다 큽니다.");
		}
	}
}

// 실습과제 1: 7이상이 입력되면 "7보다 크거나 같습니다."가 출력되도록 코드를 수정해보십시오.
// 실습과제 2: 5가 입력되면 "빙고!"가 출력되도록 코드를 수정해보십시오.
// 실습과제(고난도) 3: 3이상 10 미만이 입력되면 "좋아요."가 출력되도록 코드를 수정해 보십시오.