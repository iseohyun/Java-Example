package C_CtrlStatement;

public class E_Break {
	public static void main(String[] args) {
		int i = 1;
		while(i++ < 9999) {
			System.out.println(i + ">");
			if(i == 10) {
				break;
			}
		}
		// TODO : 15번 출력하고, 종료하도록 하세요.
	}
}