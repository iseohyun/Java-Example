package c_Control;

/**
 * 
 * coutinue���� ������, �ݺ����� ���� ó�������� �����ϰ�, ���ǹ��� �����մϴ�.
 *
 */

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
	}
}

// �ǽ����� : continue������ �ּ� ó���ϰ�, ������ ���ϼ���.