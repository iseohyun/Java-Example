package A_BasicSyntax;

/**
 * 
 *	 2������ ǥ�� ������� ���ؼ� 10������ 2���� ���̿� ������ �߻��� �� �ۿ� �����ϴ�.
 *	�Ʒ� ������ 10���� -> 2���� -> 10�������� ��ȯ�ϴ� �������� ����� ������ �����ְ� �ֽ��ϴ�.
 *  E2 ~ E3�� ��ȭ�����̱� ������ �������� ���Ѵٰ� �ص� �������ϴ�.
 *  
 */

public class F_Float {
	public static void main(String[] args) {
		double num = 0.1;
		for(int i = 0; i < 1000; i++) {
		    num += 0.1;
		}
		System.out.print(num);
	}
}
