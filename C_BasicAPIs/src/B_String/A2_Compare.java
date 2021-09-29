package B_String;

public class A2_Compare {
	public static void main(String[] args) {
		String str1 = new String("JavaCode");
		String str2 = new String("javacode");
		String str3 = new String("javaCodec");

		// ���ڸ� ����ϱ� ���� �������� ���
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);

		System.out.println("<< str1 �� str2 �� >>");
		printCompResault(str1.compareTo(str2));
		System.out.println("<< str1 �� str2 ��(��ҹ��� ����) >>");
		printCompResault(str1.compareToIgnoreCase(str2));
		System.out.println("<< str1 �� str3 �� >>");
		printCompResault(str1.compareTo(str3));
	}

	public static void printCompResault(int ret) {
		if (ret > 0) {
			System.out.println("String �Լ� ��� : ����ġ(���� ��)");
		} else if (ret < 0) {
			System.out.println("String �Լ� ��� : ����ġ(���� ����)");
		} else {
			System.out.println("String �Լ� ��� : ��ġ");
		}
	}
}