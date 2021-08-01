package B_Class;

class Mothod {
	void func1() {
		System.out.println("클레스 함수 = 메소드");
	}
}

public class A1_Method {
	public static void main(String[] args) {
		Mothod class1 = new Mothod();
		
		class1.func1();
	}
}
