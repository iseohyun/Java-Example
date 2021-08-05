package C_Interface;

public class D_Overriding {
	interface Inter1 {
		default void show(int i) {
			System.out.println("Integer : " + i);
		};
	}
	
	public static void main(String [] args) {
		Inter1 i1 = new Inter1() {};
		Inter1 i2 = new Inter1() {
			public void show(int i){
				System.out.println("Override : " + i);
			}
		};
		
		i1.show(1);
		i2.show(2);
	}
}
