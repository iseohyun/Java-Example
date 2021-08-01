package C_CtrlStatement;

import java.io.IOException;

public class C_Switch {
	public static void main(String[] args) throws IOException {
		int ans;

		System.out.println("숫자를 입력해주세요? [0-9] :");

		ans = System.in.read();
		switch(ans-'0'){
			case 0: case 1: case 2: case 3:
				System.out.println("3이하");
				break;
			case 4: case 5: case 6:
				System.out.println("4이상 6이하");
				break;
			case 7: case 8: case 9:
				System.out.println("7이상");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
		}
	}
}
