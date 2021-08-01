package C_CtrlStatement;

public class E_ContinueBreak {
	public static void main(String[] args) {
		int i = 1000;
		int cnt = 1;
		while(i++ < 2000) {
			// 조건 1. 11의 배수에서 "11의 배수입니다."를 출력합니다.
			// 조건 2. 7의 배수에서 "7의 배수입니다."를 출력합니다.

			// Quiz1. continue를 추가하여 사용하여 아래 조건을 맞추시오.
			// 조건 3. 출력을 10번 했다면 종료합니다.
			if (i % 11 == 0 ) {
				System.out.println(cnt + " : " + i + "은(는) 11의 배수입니다.");
				cnt++;
			}
			if(i % 7 == 0){
				System.out.println(cnt + " : " + i + "은(는) 7의 배수입니다.");
				cnt++;
			}

			break;
		}
	}
}