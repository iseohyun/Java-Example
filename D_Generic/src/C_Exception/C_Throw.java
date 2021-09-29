package C_Exception;

public class C_Throw {
	public static void main(String[] args) {
		try {
			handlingException();
		} catch (Exception e) {
			System.out.println("범인을 찾아라!");
		}
	}

	static void handlingException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("너였냐!");
		}
	}
}