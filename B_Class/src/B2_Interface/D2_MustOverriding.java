package B2_Interface;

interface Ov2 {
	void show();
	void show(String s);
	
	default void show(int i) {
		System.out.println("Integer : " + i);
	};
}

public class D2_MustOverriding {
	public static void main(String [] args) {
		Ov2 o = new Ov2() {
			public void show(){
				System.out.println("No String");
			}
			public void show(String s) {
				System.out.println(s);
			}
		};
		
		o.show();
		o.show("String 01");
		o.show(2);
	}
}
