package D_Array;

public class D_DblArray {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];

		int k = 10;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k;
				k += 10;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		// TODO �Ʒ��� ���� ���� �� �� �ֵ��� �ٲ㺸����.
		// 10 10 10
		// 10 10 10
		
		// TODO �Ʒ��� ���� ���� �� �� �ֵ��� �ٲ㺸����.
		// 10 20 30
		// 10 20 30

		// TODO �Ʒ��� ���� ���� �� �� �ֵ��� �ٲ㺸����.
		// 10 10 10
		// 20 20 20
	}
}