package g_Exception;

public class B2_Typecast {
	public static void main(String[] args) {
		Object x = 123;
		try {
			System.out.println((String) x);
		} catch (ClassCastException e) {
			System.out.println("������ �߰ߵǾ����ϴ�.");
			System.out.println(x.toString());
		}
	}
}