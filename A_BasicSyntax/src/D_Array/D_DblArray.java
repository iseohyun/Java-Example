package D_Array;

public class D_DblArray {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];

		int k = 10;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k; // 인덱스를 이용한 초기화
				k += 10;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}