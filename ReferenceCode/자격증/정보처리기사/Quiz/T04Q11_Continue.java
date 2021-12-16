package Quiz;
/*
 * 분석결과를 쓰시오.
 * 
 */
public class T04Q11_Continue {
	public static int[] makeArray(int n) {
		int[] t = new int[n];
		for(int i = 0; i < n; i++) {
			t[i] = i*2;
		}
		return t;
	}
	public static void main(String[] args) {
		int[] a = makeArray(5);
		for(int i = 0; i < a.length; i++) {
			if(i%2 == 0) continue;
			System.out.print(a[i] + " ");
		}
	}
}
