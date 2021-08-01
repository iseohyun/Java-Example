package C_Extends;

class Mother {
	String str = "Mom";
}

class Daughter extends Mother {
    String str = "me";
}

public class A2_SameVal {
	public static void main(String[] args) {
		Mother m = new Mother();
		Daughter d = new Daughter();

		System.out.println(m.str);
		System.out.println(d.str);
	}
}