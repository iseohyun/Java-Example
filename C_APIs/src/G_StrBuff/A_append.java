package G_StrBuff;

public class A_append {
	public static void main(String [] args) {
		StringBuffer str = new StringBuffer("Java");
		System.out.println("실행 전 : " + str);
		System.out.println(str.append("수업"));
		System.out.println("실행 후 : " + str);
		
		String str2 = "Java";
		System.out.println("실행 전 : " + str2);
		System.out.println(str2.concat("수업"));
		System.out.println("실행 후 : " + str2);
	}
}
