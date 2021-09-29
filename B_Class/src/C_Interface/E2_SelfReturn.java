package C_Interface;

public class E2_SelfReturn {
	interface Inter1 {
		default String show(String s) {
			return "<<" + s + ">>";
		};
	}

	public static void main(String[] args) {
		show("New String", new Inter1() {
		});
	}

	static void show(String s, Inter1 inter) {
		System.out.println(inter.show(s));
	}
}