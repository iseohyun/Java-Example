package g_Exception;

public class A1_Exception {
	public static void main(String[] args) {
		int[] list = new int[3];

		try {
			for (int i = 0; i < 4; i++)
				list[i] = i;
		} catch (Exception e) {
			System.out.println("에러가 발생하였습니다.");
			System.out.println(e);
		}
	}
}