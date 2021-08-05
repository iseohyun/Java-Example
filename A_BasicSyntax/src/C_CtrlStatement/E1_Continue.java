package C_CtrlStatement;

public class E1_Continue {
	public static void main(String[] args) {
		int i = 1;
		while(i++ < 9999) {
			System.out.println(i + ">");
			if(i == 5) {
				continue;
			}
			if(i % 5 == 0) {
				break;
			}
		}
		// TODO : continue구문을 주석 처리하고, 동작을 비교하세요.
	}
}