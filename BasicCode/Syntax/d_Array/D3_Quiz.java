package d_Array;

public class D3_Quiz {
	public static void main(String[] args) {
		//int i = 0, j = 0;
		int[][] arr = {
			{88, 66, 44, 22, 0 },	// 1 열
			{15, 24, 33, 42, 51},	// 2 열
			{11, 33, 55, 77, 99}	// 3 열
		};
		
		System.out.println("변경 전 :");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("[" + arr[i][j] + "]");
			}
			System.out.println();
		}
		
		// 실습과제 : 코드를 삽입하여 각 열의 데이터를 이동시키시오. 
		// 1열 -> 2열 -> 3열 -> 1열
		
		System.out.println("변경 후 :");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("[" + arr[i][j] + "]");
			}
			System.out.println();
		}
	}
}
