package a_Class;

/**
 * 
 * static�� �޸𸮸� �����մϴ�.
 * ��, static���� ����� �޼���(class method)�� �׻� �޸𸮿� �����ϴ� �޼����̹Ƿ�,
 * �ν��Ͻ��� ���� �������� �ʴ��� ����� �� �ֽ��ϴ�.
 *
 */

public class D_Static {
	static class Class1 {
		static int seq = 1;
		int id;

		Class1() {
			id = seq++;
		}
	}

	public static void main(String[] args) {
		Class1 a1 = new Class1();
		System.out.println("id : " + a1.id);

		Class1 a2 = new Class1();
		System.out.println("id : " + a2.id);

		Class1 a3 = new Class1();
		System.out.println("id : " + a3.id);
	}
}