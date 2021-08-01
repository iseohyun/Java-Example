package C_Extends;

public class G_InnerClass {
	public static void main(String[] strA) {
		class Inner{
			static int a = 0;
			public void innerPrint() {
				System.out.println("Inner Print :" + (a++));
			}
		}

		Inner in = new Inner();
		in.innerPrint();
		in.innerPrint();
		in.innerPrint();
	}
}
