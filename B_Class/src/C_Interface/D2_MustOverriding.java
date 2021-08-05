package C_Interface;

public class D2_MustOverriding {
	interface Inter1 {
		void show();
		void show(String s);
		
		default void show(int i) {
			System.out.println("Integer : " + i);
		};
	}
	
	public static void main(String [] args) {
		Inter1 i1 = new Inter1() {
			public void show(){
				System.out.println("No String");
			}
			public void show(String s) {
				System.out.println(s);
			}
		};
		
		i1.show();
		i1.show("String 01");
		i1.show(2);
	}
}
