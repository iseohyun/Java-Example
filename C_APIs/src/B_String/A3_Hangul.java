package B_String;

public class A3_Hangul {

	
	public static void main(String[] args) {
		String str1 = new String("�ѱۺ�");
		String str2 = new String("�ѱۻ��");
		String str3 = new String("�ѱۺ�");
		String str4 = new String("�ѱ� ��");
		
		// ���ڸ� ����ϱ� ���� �������� ���
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		System.out.println("<< str1 �� str2 �� >>");
		printCompResault(str1.compareTo(str2));
		System.out.println("<< str1 �� str3 �� >>");
		printCompResault(str1.compareTo(str3));
		System.out.println("<< str1 �� str4 �� >>");
		printCompResault(str1.compareTo(str4));
	}
	
	public static void printCompResault(int ret) {
		if(ret > 0) {
			System.out.println("String �Լ� ��� : ����ġ(���� ��)");
		}else if(ret < 0){
			System.out.println("String �Լ� ��� : ����ġ(���� ����)");
		}else {
			System.out.println("String �Լ� ��� : ��ġ");
		}
	}
}
