package Quiz;
class Parent{
	void show() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	void show() {
		System.out.println("Child");
	}
}

public class Y20T02Q12_Extends {	
	public static void main(String[] args) {
		Parent pa = /*****/ new Child();
		pa.show();
	}
}