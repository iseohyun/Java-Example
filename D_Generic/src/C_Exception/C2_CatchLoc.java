package C_Exception;

public class C2_CatchLoc {
	public static void main(String[] args) {
		try {
			handlingException();
		} catch (Exception e) {
			System.out.println("������ ã�ƶ�!");
		}
	}

	static void handlingException() throws Exception {
		throw new Exception();
	}
}