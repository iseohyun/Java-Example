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
			System.out.println("오류가 발견되었습니다 : 1");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("오류가 발견되었습니다 : 2");
			System.out.println(e.toString());
		}
	}
}