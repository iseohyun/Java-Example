package B_String;

public class A3_Hangul {

	
	public static void main(String[] args) {
		String str1 = new String("한글비교");
		String str2 = new String("한글사랑");
		String str3 = new String("한글비교");
		String str4 = new String("한글 비교");
		
		// 문자를 출력하기 위한 여러가지 방법
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		System.out.println("<< str1 과 str2 비교 >>");
		printCompResault(str1.compareTo(str2));
		System.out.println("<< str1 과 str3 비교 >>");
		printCompResault(str1.compareTo(str3));
		System.out.println("<< str1 과 str4 비교 >>");
		printCompResault(str1.compareTo(str4));
	}
	
	public static void printCompResault(int ret) {
		if(ret > 0) {
			System.out.println("String 함수 결과 : 불일치(사전 순)");
		}else if(ret < 0){
			System.out.println("String 함수 결과 : 불일치(사전 역순)");
		}else {
			System.out.println("String 함수 결과 : 일치");
		}
	}
}
