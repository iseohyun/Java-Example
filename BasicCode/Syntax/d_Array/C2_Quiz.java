package d_Array;

public class C2_Quiz {
	public static void main(String[] agrs) {
		int[] Arr = new int[20];
		Arr[0] = 1;
		Arr[1] = 1;
		Arr[2] = Arr[0] + Arr[1];
		Arr[3] = Arr[1] + Arr[2];
		// �Ǻ���ġ ������ ���� �� ���� ���� �����̴�.
		for (int i = 0; i < Arr.length; i++) {
			if (i > 3) {
				// �ǽ�����(����) : ������ �ڵ带 �����Ͽ�, �Ǻ���ġ ������ ��µǵ��� �Ͻÿ�.

			}
			// �� : Arr[19] = 6765�̴�.
			System.out.println(i + "��° ���� : " + Arr[i]);
		}
	}
}