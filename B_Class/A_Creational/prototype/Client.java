package prototype;

/**
 * ��ó : https://ko.wikipedia.org/wiki/%ED%94%84%EB%A1%9C%ED%86%A0%ED%83%80%EC%9E%85_%ED%8C%A8%ED%84%B4
 * 
 * @author Seohyun Jung
 *
 *		������ Ÿ�� ���� : ������Ÿ��=����ǰ �� �ǹ�
 *			new�� ȣ������ �� ����� �δ��� ���̱� ���ؼ� cloneable�� implements�Ѵ�.
 */

class Cookie implements Cloneable {
	public Object clone() {
		try {
			Cookie copy = (Cookie) super.clone();
			return copy;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}

class CoconutCookie extends Cookie {
	public String str = "Proto type"; // 2
}

public class Client {
	private Cookie cookie;

	public Client(Cookie cookie) {
		this.cookie = cookie; // 4
	}

	public Cookie makeCookie() {
		return (Cookie) cookie.clone(); // 6
	}

	public static void main(String args[]) {
		Cookie tempCookie = null;
		Cookie prot = new CoconutCookie(); // 1
		Client cm = new Client(prot); // 3
		for (int i = 0; i < 100; i++) {
			tempCookie = cm.makeCookie(); // 5
			System.out.println(tempCookie + " -> " + ((CoconutCookie) tempCookie).str);
		}
	}
}