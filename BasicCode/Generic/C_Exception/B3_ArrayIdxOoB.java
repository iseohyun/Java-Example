package C_Exception;

public class B3_ArrayIdxOoB {
	public static void main(String[] args) {
		int[] array1 = new int[3];
		try {
			array1[4] = 1;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("처리 되었습니다.");
		}
	}
}