package a_Class;

/**
 * 
 * �޼ҵ带 ����ϱ� ���ؼ��� �ν��Ͻ��� �����ϰ�, ��(.)�����ڸ� ���ؼ� ȣ�� �� �� �ֽ��ϴ�.
 * ��, static���� ����� �޼���(class method)�� �׻� �޸𸮿� �����ϴ� �޼����̹Ƿ�,
 * �ν��Ͻ��� ���� �������� �ʴ��� ����� �� �ֽ��ϴ�.
 *
 */

public class D2_Static {
	static class Class1 {
		static void print(int i) {
			System.out.println("��� : " + i);
		}
	}

	public static void main(String[] args) {
		Class1.print(50);
		Class1.print(100);
	}
}