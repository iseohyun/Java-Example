package C_CtrlStatement;

/**
 * 
 * break���� ������ �ݺ����� �����߿� ������ �ߴ��մϴ�.
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

//�ǽ����� : 15�� ����ϰ�, �����ϵ��� ������ ������.