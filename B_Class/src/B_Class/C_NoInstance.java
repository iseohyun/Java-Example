package B_Class;

class Method {
    // instance Method
    void func1(int input) {
    	System.out.println("�ν��Ͻ� �޼ҵ� : " + input);
    }

    // class Method
    static void func2(int input) {
    	System.out.println("Ŭ���� �޼ҵ� : " + input);
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
