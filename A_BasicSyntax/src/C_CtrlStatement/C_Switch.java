package C_CtrlStatement;

public class C_Switch {
	public static void main(String[] args) {
		int a = 0;

		switch(a){
			case 0:
				System.out.println("하나");
				break;
			case 1:
				System.out.println("둘");
			case 2:
				System.out.println("셋");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
		}
		
		// TODO 1: a를 1 또는 2로 수정해서 수행해보세요.
		// TODO 2: 1을 입력했을 때, "둘셋"이 아니라 "둘"만 출력되도록 수정하세요.
	}
}
