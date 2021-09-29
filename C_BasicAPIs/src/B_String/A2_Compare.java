package B_String;

public class A2_Compare {
	public static void main(String[] args) {
		String str1 = new String("JavaCode");
		String str2 = new String("javacode");
		String str3 = new String("javaCodec");

		// 문자를 출력하기 위한 여러가지 방법
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);

		System.out.println("<< str1 과 str2 비교 >>");
		printCompResault(str1.compareTo(str2));
		System.out.println("<< str1 과 str2 비교(대소문자 무시) >>");
		printCompResault(str1.compareToIgnoreCase(str2));
		System.out.println("<< str1 과 str3 비교 >>");
		printCompResault(str1.compareTo(str3));
	}

	public static void printCompResault(int ret) {
		if (ret > 0) {
			System.out.println("String 함수 결과 : 불일치(사전 순)");
		} else if (ret < 0) {
			System.out.println("String 함수 결과 : 불일치(사전 역순)");
		} else {
			System.out.println("String 함수 결과 : 일치");
		}
	}
}