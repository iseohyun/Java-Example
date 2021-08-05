package C_Exception;

public class B4_NullPtr {
	public static void main(String[] str) {
		String ptr = null;
		try {
			boolean b = ptr.equals("String")?true:false;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
