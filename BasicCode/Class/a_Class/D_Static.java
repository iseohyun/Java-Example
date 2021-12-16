package a_Class;

/**
 * 
 * �޼ҵ带 ����ϱ� ���ؼ��� �ν��Ͻ��� �����ϰ�, ��(.)�����ڸ� ���ؼ� ȣ�� �� �� �ֽ��ϴ�.
 * ��, static���� ����� �޼���(class method)�� �׻� �޸𸮿� �����ϴ� �޼����̹Ƿ�,
 * �ν��Ͻ��� ���� �������� �ʴ��� ����� �� �ֽ��ϴ�.
 *
 */

@SuppressWarnings("static-access")
public class D_Static {
	static class Class1 {
		// instance
		void func1(int i) {
			System.out.println("�ν��Ͻ� �޼ҵ� : " + i);
		}
		int instanceVar = 20;

		// class
		static void func2(int i) {
			System.out.println("Ŭ���� �޼ҵ� : " + i);
		}
		static int classVar = 40;
	}

	public static void main(String[] args) {
		// �Ϲ����� �޼ҵ� �����
		// 1. ������ �Ѵ�.
		Class1 c1;
		
		// 2. �ν��Ͻ��� �����Ѵ�.
		c1 = new Class1();

		// 3. �Լ��� �ҷ� ����.
		c1.func1(10);
		System.out.println("�ν��Ͻ� �ʵ� : " + c1.instanceVar);
		c1.func2(30);
		System.out.println("Ŭ���� �ʵ� : " + c1.classVar);

		// Static �޼ҵ� �����
		// 1. �׳� ����.
		Class1.func2(50);
		System.out.println("Ŭ���� �ʵ� : " + Class1.classVar);
	}
}