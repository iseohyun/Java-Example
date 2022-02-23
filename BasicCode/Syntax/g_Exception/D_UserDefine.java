package g_Exception;

@SuppressWarnings("serial")
class MyException extends RuntimeException {
	MyException(String errMsg) {
		super(errMsg);
	}
}

public class D_UserDefine {
	public static void main(String[] args) {
		try {
			throw new MyException(null);
		} catch (MyException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}