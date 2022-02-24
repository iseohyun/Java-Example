package a_Object;

public class B_Equals {
	static class Class1 {
		String str;

		Class1(String str) {
			this.str = str;
		}
	}

	public static void main(String[] args) {
		Class1 c1 = new Class1("String");
		Class1 c2 = new Class1("String");

		String ans = c1.equals(c2) ? "같다" : "다르다";
		System.out.println(c1.hashCode() + "과 " + c2.hashCode() + "는 " + ans);

		c1 = c2;
		ans = c1.equals(c2) ? "같다" : "다르다";
		System.out.println(c1.hashCode() + "과 " + c2.hashCode() + "는 " + ans);

		c2.str = "New String";
		System.out.println(c1.str);
	}
}
