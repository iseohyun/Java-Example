package d_Array;

public class D3_Quiz {
	public static void main(String[] args) {
		//int i = 0, j = 0;
		int[][] arr = {
			{88, 66, 44, 22, 0 },	// 1 ��
			{15, 24, 33, 42, 51},	// 2 ��
			{11, 33, 55, 77, 99}	// 3 ��
		};
		
		System.out.println("���� �� :");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("[" + arr[i][j] + "]");
			}
			System.out.println();
		}
		
		// �ǽ����� : �ڵ带 �����Ͽ� �� ���� �����͸� �̵���Ű�ÿ�. 
		// 1�� -> 2�� -> 3�� -> 1��
		
		System.out.println("���� �� :");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("[" + arr[i][j] + "]");
			}
			System.out.println();
		}
	}
}
