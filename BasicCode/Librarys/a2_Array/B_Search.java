package a2_Array;

import java.util.Arrays;

public class B_Search {
	static class A {
		int No;
		String str;
	}

	public static void main(String[] args) {
		int[] arr = new int[1000];
		A a[] = new A[1000];

		for (int i = 0; i < a.length; i++) {
			a[i] = new A();
			a[i].No = arr[i] = i * 2 + 1;
			a[i].str = "0x" + Integer.toHexString(i).toUpperCase();
		}

		int ret = Arrays.binarySearch(arr, 437);
		System.out.println(ret + ":" + a[ret].str);
	}
}