package f_Function;

/**
 * 
 * E_Local�� �Ȱ��� �������� ����� �ٸ��ϴ�.
 * val�� �Լ� �ٱ��� �ֱ� ������ �Լ��� ���ֿ� �������, �׻� ��� �ִ� �����̱� ������, ��������� �����Ǵ� ���� Ȯ�� �� �� �ֽ��ϴ�.
 *
 */

public class E2_Static {
	public static void main(String[] args) {
		func1();
		func1();
		func1();
		func1();
		func1();
	}
	
	static int val = 1;
	static void func1() {
		val++;
		System.out.println("���� ���� : " + val);
	}
}