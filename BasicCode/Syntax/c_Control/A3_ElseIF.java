package c_Control;

import tools.Input;

public class A3_ElseIF {
	public static void main(String[] args){
		int a = Input.getInt();
		if( a == 1 ) {
			System.out.println("하나 입니다!");
		} else if ( a == 2 ){
			System.out.println("둘 입니다!");
		} else {
			System.out.println("알 수 없습니다.");
		}
	}
}

// 실습과제 1: 위 코드에서, 3을 입력하면 "셋 입니다!"가 출력되도록 코드를 추가 해 봅니다.
// 실습과제 2(고난도): 내용을 삭제하고 아래와 같은 내용이 출력 되도록 수정해봅니다.
//		1 입력시 : 5보다 작으며, 홀수 입니다.
//		2 입력시 : 5보다 작으며, 짝수 입니다.
//		3 입력시 : 5보다 작으며, 홀수 입니다.
//		5 입력시 : 5입니다. 홀수 입니다.
//		6 입력시 : 5보다 크며, 짝수 입니다.
//		7 입력시 : 5보다 크며, 홀수 입니다.