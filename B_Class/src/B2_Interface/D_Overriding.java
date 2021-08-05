package B2_Interface;

interface Ov {
	default void show(int i) {
		System.out.println("Integer : " + i);
	};
}

public class D_Overriding {
	public static void main(String [] args) {
		Ov o1 = new Ov() {};
		Ov o2 = new Ov() {
			public void show(int i){
				System.out.println("Override : " + i);
			}
		};
		
		o1.show(1);
		o2.show(2);
	}
}
