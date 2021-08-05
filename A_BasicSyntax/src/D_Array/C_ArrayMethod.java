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
		
		// TODO : arr4에 1 1 1 1 1 1 1 1 1 1이 출력 될 수 있도록 저장해보세요.
		// TODO : arr4에 0 1 2 3 4 5 6 7 8 9이 출력 될 수 있도록 저장해보세요.
		// TODO : arr4에 9 8 7 6 5 4 3 2 1 0이 출력 될 수 있도록 저장해보세요.
	}
}
