package C_CtrlStatement;

public class E_ContinueBreak {
	public static void main(String[] args) {
		int i = 1000;
		int cnt = 1;
		while(i++ < 2000) {
			// ���� 1. 11�� ������� "11�� ����Դϴ�."�� ����մϴ�.
			// ���� 2. 7�� ������� "7�� ����Դϴ�."�� ����մϴ�.

			// Quiz1. continue�� �߰��Ͽ� ����Ͽ� �Ʒ� ������ ���߽ÿ�.
			// ���� 3. ����� 10�� �ߴٸ� �����մϴ�.
			if (i % 11 == 0 ) {
				System.out.println(cnt + " : " + i + "��(��) 11�� ����Դϴ�.");
				cnt++;
			}
			if(i % 7 == 0){
				System.out.println(cnt + " : " + i + "��(��) 7�� ����Դϴ�.");
				cnt++;
			}

			break;
		}
	}
}