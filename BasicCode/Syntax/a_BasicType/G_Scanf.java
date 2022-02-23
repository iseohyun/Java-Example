package a_BasicType;

import java.io.IOException;

/**
 * 
 *	문자 a를 입력해 보고, 숫자 1을 입력해 봅니다. 어떻게 다른지 비교해봅시다.
 *	11을 입력해보고, 1을 입력한 것과 비교해 봅니다.
 *
 */

public class G_Scanf {
	public static void main(String[] args) throws IOException {
		int i;
		
		System.out.print("문자를 입력해 주세요 : ");
		i = System.in.read();
		System.out.println("저장된 정보는 : " + i);
		System.out.println("문자로 인식시켜서 출력 : " + (char)i);
	}
}

// 실습과제 1: a를 입력하면 b가 출력되도록 수정해 보세요.
// 실습과제 2: a을 입력하면 A가 출력되도록 수정해보세요.