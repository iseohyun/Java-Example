package a_Class;

/**
 * 
 * 클래스도 배열로 선언이 가능합니다.
 *
 */

public class F_Array {
	static class Class1 {
		int var = 0;
		char ch = 'a';
	}

	public static void main(String[] args) {
		Class1[] arr1 = new Class1[5];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = new Class1();
			arr1[i].var = i * 2;
			arr1[i].ch = (char) ('A' + i);
		}

		for (Class1 arr : arr1) {
			System.out.println("[ " + arr.var + " ] " + arr.ch);
		}
	}
}