package C_Exception;

public class C_Throw {
	public static void main(String[] args) {
		try {
			handlingException();
		} catch (Exception e) {
			System.out.println("������ ã�ƶ�!");
		}
	}

	static void handlingException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("�ʿ���!");
		}
	}
}