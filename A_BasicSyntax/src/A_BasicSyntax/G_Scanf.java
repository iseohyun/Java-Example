package A_BasicSyntax;

import java.io.IOException;

/**
 * 
 * @author Seohyun Jung
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
