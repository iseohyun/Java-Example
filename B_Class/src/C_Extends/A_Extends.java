package C_Extends;

class Father {
	String str = "Father";
}

class Son extends Father {
    String str2 = "Son";
}

public class A_Extends {
	public static void main(String[] args) {
		Son class1 = new Son();
		System.out.println(class1.str);
		System.out.println(class1.str2);
	}
}