package D_Array;

public class C_ArrayMethod {
	public static void main(String[] argv) {
		int[] arr1 = new int[]{1, 2, 3, 4, 5};
		int[] arr2 = new int[10];
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		int[] arr3 = (int[])arr1.clone();
		int[] arr4 = new int[10];

		System.out.println("[Arr1]");
		for (int e : arr1)System.out.print(e + " ");
		System.out.println("\n[Arr2]");
		for (int e : arr2)System.out.print(e + " ");
		System.out.println("\n[Arr3]");
		for (int e : arr3)System.out.print(e + " ");
		System.out.println("\n[Arr4]");
		for (int e : arr4)System.out.print(e + " ");
		
		// TODO : arr4�� 1 1 1 1 1 1 1 1 1 1�� ��� �� �� �ֵ��� �����غ�����.
		// TODO : arr4�� 0 1 2 3 4 5 6 7 8 9�� ��� �� �� �ֵ��� �����غ�����.
		// TODO : arr4�� 9 8 7 6 5 4 3 2 1 0�� ��� �� �� �ֵ��� �����غ�����.
	}
}
