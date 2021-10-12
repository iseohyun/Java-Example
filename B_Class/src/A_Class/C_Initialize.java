package A_Class;

/**
 * 
 * ������ :
 * 	Ŭ������ ������ ��, ����Ǵ� �ڵ��Դϴ�. �ڵ� ������ class��� ������ �Լ��Դϴ�.
 * ������� class1�� �����ڴ� class1()�Դϴ�.
 * 
 * Ŭ������ �ۼ��ϴ� ���� ���赵�� �����ϴ�. ��, ���赵�� �ۼ��ص� ������ ������ ���� �ƹ��͵� ���ٴ� ���Դϴ�.
 * ������ �Ѵٴ� �ǹ̴� ��ǻ�Ϳ��� ����� �� �� �ִٴ� ���� �˷��ִ� �����Դϴ�. ���� �ƹ��� �ൿ�� ���� �ʽ��ϴ�.
 * �޸𸮿� �ö󰡴� ����, ������ �����ϴ� �����ΰ��� �˴ϴ�. �츮�� �̷��� ������ �����ΰ��� �ν��Ͻ���� �θ��ϴ�.
 *
 */

@SuppressWarnings("unused")
public class C_Initialize {
	static class Class1 {
		Class1() {
			System.out.println("������ ȣ��");
		}
		Class1(int i) {
			System.out.println("���� : " + i);
		}

		Class1(char c) {
			System.out.println("���� : " + c);
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Ŭ������ �����մϴ�.");
		Class1 c0;
		
		System.out.println("Ŭ������ �����ϰ� �ν��Ͻ��� �����մϴ�..");
		Class1 c1 = new Class1();
		Class1 c2 = new Class1(1);
		Class1 c3 = new Class1('a');
	}
}

// �ǽ����� : class2�� �����ϰ�, �����ڸ� �����մϴ�. �����ڴ� "ȣ��Ǿ����ϴ�"�� ����մϴ�.
// �ǽ����� : ���ڿ��� �Է¹޾� ����ϴ� �����ڸ� �߰��մϴ�.