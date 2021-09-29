package B_Class;

@SuppressWarnings("static-access")
public class C_Static4Method {
	static class Class1 {
		// instance Method
		void func1(int i) {
			System.out.println("인스턴스 메소드 : " + i);
		}

		// class Method
		static void func2(int i) {
			System.out.println("클레스 메소드 : " + i);
		}
	}

	public static void main(String[] args) {
		Class1.func2(10);
		Class1 c1 = new Class1();

		c1.func1(20);
		c1.func2(30);
	}
}