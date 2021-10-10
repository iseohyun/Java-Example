package C_CtrlStatement;

/**
 * 
 * break문을 만나면 반복문이 수행중에 무조건 중단합니다.
 *
 */

public class E_Break {
	public static void main(String[] args) {
		int i = 1;
		while(i++ < 9999) {
			System.out.println(i + ">");
			if(i == 10) {
				break;
			}
		}
	}
}

//실습과제 : 15번 출력하고, 종료하도록 수정해 보세요.