package g_Exception;

@SuppressWarnings("null")
public class B4_NullPtr {
	public static void main(String[] str) {
		String ptr = null;
		try {
			boolean b = ptr.equals("String") ? true : false;
			if (b)
				System.out.println("String");
		} catch (Exception e) {
			System.out.println("������ �߰ߵǾ����ϴ�.");
			e.printStackTrace();
		}
	}
}