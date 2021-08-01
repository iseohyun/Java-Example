package C_Extends;

class Super1 {
	Super1() {
		System.out.println("Super 1 : init");
	}
}

class Super2 extends Super1 {
	Super2(){
	super();
		System.out.println("Super 2 : init");
	}
}

class Super3 extends Super2 {
	Super3(){
		super();
		System.out.println("Super 3 : init");
	}
}

public class B2_SuperSuper{
	public static void main(String[] args) {
		Super3 su1 = new Super3();
	}
}
