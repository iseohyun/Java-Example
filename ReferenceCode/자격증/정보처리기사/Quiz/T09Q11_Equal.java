package Quiz;

/*
 * �м������ ���ÿ�.
 * 
 */
class User {
	private String id;
	private String name;
	User(String id, String name) {
		this.id = id;
		this.name = name ;
	}
}

public class T09Q11_Equal {
	public static void main(String[] args) {
		User a = new User("pass1", "��浿");
		User b = new User("pass1", "��浿");
		User c = a;
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(c));
		System.out.println(a.equals(b));
	}
}

// 150p : false, true, true, true