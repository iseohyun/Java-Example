package d_Array;

/**
 * 
 * �Լ��� �ϱ� �� �ʿ� �����ϴ�. ����, ���� ����� �ֱ��� �ϰ� �˰� �Ѿ�ٰ� ���߿� �ٽ� ã�ƺ��� �˴ϴ�.
 *
 *	�迭�� ���, for���� Ư���� ������ �ֽ��ϴ�.
 *	for(���� : �迭){�ٵ�;}
 *
 *	������� array type�� int�� �ϸ�, (**�ϱ�!)
 *		for(int unit : array) { �ٵ�; }
 *	
 *		array type�� String�̶� �ϸ�,
 *		for(String str : array) { �ٵ�; }
 *
 *	�� �ٲ� �� �ֽ��ϴ�.
 *	
 */

public class C_ArrayMethod {
	public static void main(String[] argv) {
		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[10];
		int[] arr3;

		System.out.println("[Arr1]");
		for (int e : arr1)
			System.out.print(e + " ");

		// �迭�� ���� �� �� �ֽ��ϴ�.
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		System.out.println("\n[Arr2]");
		for (int e : arr2)
			System.out.print(e + " ");

		// �迭�� ���� �� �� �ֽ��ϴ�.
		arr3 = (int[]) arr1.clone();
		System.out.println("\n[Arr3]");
		for (int e : arr3)
			System.out.print(e + " ");
	}
}

// �ǽ����� : 10��¥�� �迭�� ����ϴ�. ��� ������ 0�� �����ϰ� 0�� ����غ��ϴ�.
// �ǽ����� 2: 10��¥�� �迭�� ����ϴ�. 1���� 10���� �����ϰ� 0�� ����غ��ϴ�.
// �ǽ����� 3: 10��¥�� �迭�� ����ϴ�. 3�� ����� ������� ����(3, 6, 9, 12,..)�ϰ� ����մϴ�.