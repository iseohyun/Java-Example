package B2_Interface;

interface Rs {
	default String show(String s) {
		return "<<"+s+">>";
	};
}

public class E2_SelfReturn {
	public static void main(String [] args) {
		show("New String", new Rs(){});
	}
	
	static void show(String s, Rs rs) {
		System.out.println(rs.show(s));
	}
}