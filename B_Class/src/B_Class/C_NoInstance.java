package B_Class;

class Method {
    // instance Method
    void func1(int input) {
    	System.out.println("인스턴스 메소드 : " + input);
    }

    // class Method
    static void func2(int input) {
    	System.out.println("클레스 메소드 : " + input);
    }
}

public class C_NoInstance {
	public static void main(String[] argv) {
        Method.func2(10);
        Method class1 = new Method();

        class1.func1(20);
        class1.func2(30);
	}
}
