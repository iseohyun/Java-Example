package g_Exception;

@SuppressWarnings("unused")
public class B4_NullPtr2 {

	@SuppressWarnings("null")
	public static void main(String[] str) {
		String ptr = null;
		try {
			boolean b = ptr.equals("String") ? true : false;
		} catch (NullPointerException e) {
			System.out.println("ptr is null");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}