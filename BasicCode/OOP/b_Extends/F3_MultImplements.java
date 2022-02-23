package b_Extends;

public class F3_MultImplements {
	interface inter1 {
		public default void func1() {
			System.out.println("Func1");
		}
	}

	interface inter2 {
		public default void func2() {
			System.out.println("Func2");
		}
	}

	static class Class1 implements inter1, inter2 {
	}

	public static void main(String[] args) {
		Class1 c1 = new Class1();

		c1.func1();
		c1.func2();
	}
}

// 실습과제 : 만약 func2를 func1로 변경하면 어떻게 될까요?