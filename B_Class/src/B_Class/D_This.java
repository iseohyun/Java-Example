package B_Class;

public class D_This {
	static class Class1 {
		int var = 10;
		void func1(int var) {
			this.var = var;
		}
		void func2(int var) {
			var = var;
		}
	}
	public static void main(String[] args) {
		Class1 c1 = new Class1();
		
		System.out.println("1 : " + c1.var);
		
		c1.func1(20);
		System.out.println("2 : " + c1.var);
		
		c1.func2(30);
		System.out.println("3 : " + c1.var);
	}
}