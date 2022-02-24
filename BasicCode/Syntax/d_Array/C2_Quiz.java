package d_Array;

public class C2_Quiz {
	public static void main(String[] agrs) {
		int[] Arr = new int[20];
		Arr[0] = 1;
		Arr[1] = 1;
		Arr[2] = Arr[0] + Arr[1];
		Arr[3] = Arr[1] + Arr[2];
		// 피보나치 수열은 앞을 두 수를 합한 수열이다.
		for (int i = 0; i < Arr.length; i++) {
			if (i > 3) {
				// 실습과제(고난도) : 적절한 코드를 삽입하여, 피보나치 수열이 출력되도록 하시오.

			}
			// 예 : Arr[19] = 6765이다.
			System.out.println(i + "번째 수열 : " + Arr[i]);
		}
	}
}