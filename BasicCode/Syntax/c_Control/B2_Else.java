package c_Control;

import tools.Input;

public class B2_Else {
	public static void main(String[] args) {
		int a = Input.getInt();
		if (a > 5) {
			System.out.println("좋아요.");
		} else {
			System.out.println("싫어요.");
		}
	}
}

// 실습과제 1: "싫어요." 가 출력되는 조건은 무엇입니까?
// 실습과제 2: 9가 입력되면 "싫어요." 가 출력되도록 수정해보십시오.
// 실습과제 3: 1 <= x < 10 이면 "싫어요."가 출력되도록 수정해보십시오.