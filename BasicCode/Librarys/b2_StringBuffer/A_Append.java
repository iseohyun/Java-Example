package b2_StringBuffer;

public class A_Append {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Java");
		System.out.println("���� �� : " + str);
		System.out.println(str.append("����"));
		System.out.println("���� �� : " + str);

		String str2 = "Java";
		System.out.println("���� �� : " + str2);
		System.out.println(str2.concat("����"));
		System.out.println("���� �� : " + str2);
	}
}