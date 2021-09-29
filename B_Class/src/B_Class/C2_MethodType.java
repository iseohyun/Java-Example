package B_Class;

@SuppressWarnings("static-access")
public class C2_MethodType {
	static class Class1 {
		static int classVar = 10;
		int instanceVar = 20;

		Class1() {
			instanceVar = 50;
		}
	}

	public static void main(String[] args) {
		// �ν��Ͻ� ���� ���� ��밡��
		System.out.println("1 : " + Class1.classVar);

		Class1 myInit = new Class1();
		System.out.println("2 : " + myInit.instanceVar);
		System.out.println("3 : " + myInit.classVar);
	}
}