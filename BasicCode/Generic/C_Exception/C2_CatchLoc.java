package C_Exception;

public class C2_CatchLoc {
	public static void main(String[] args) {
		try {
			handlingException();
		} catch (Exception e) {
			System.out.println("범인을 찾아라!");
		}
	}

	static void handlingException() throws Exception {
		throw new Exception();
	}
}