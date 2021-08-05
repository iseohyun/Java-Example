package D_Extends;

public class B2_SuperSuper{
	static class Super1 {
		Super1() {
			System.out.println("Super 1 : init");
		}
	}

	static class Super2 extends Super1 {
		Super2(){
		super();
			System.out.println("Super 2 : init");
		}
	}

	static class Super3 extends Super2 {
		Super3(){
			super();
			System.out.println("Super 3 : init");
		}
	}

	public static void main(String[] args) {
		Super3 su1 = new Super3();
	}
}
