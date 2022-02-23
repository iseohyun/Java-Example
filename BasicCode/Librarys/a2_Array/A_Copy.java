package a2_Array;

import java.util.Arrays;

public class A_Copy {
	public static void main(String[] args) {
		int[] arr1 = { 5, 2, 3, 1, 4 };
		System.out.print("1 : ");
		for (int i : arr1) {
			System.out.print(arr1[i - 1] + " ");
		}

		System.out.println();
		System.out.print("2 : ");
		Arrays.sort(arr1);
		for (int i : arr1) {
			System.out.print(arr1[i - 1] + " ");
		}

		System.out.println();
		System.out.print("3 : ");
		int[] arr2 = Arrays.copyOf(arr1, 3);
		for (int i : arr2) {
			System.out.print(arr2[i - 1] + " ");
		}

		System.out.println();
		System.out.print("4 : ");
		int[] arr3 = Arrays.copyOf(arr1, 10);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}

		System.out.println();
		System.out.print("5 : ");
		int[] arr4 = Arrays.copyOfRange(arr3, 3, 9);
		for (int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i] + " ");
		}

		System.out.println();
		System.out.print("6 : ");
		Arrays.fill(arr4, 7);
		for (int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i] + " ");
		}
	}
}