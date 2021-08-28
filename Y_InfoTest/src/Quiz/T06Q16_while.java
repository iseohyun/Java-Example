package Quiz;
/*
 * 분석결과를 쓰시오.
 * 
 */
public class T06Q16_while {
	public static void main(String[] args) {
		int []a = {1, 2, 3, 4, 5};
		int i = a.length - 1;
		int result = 0;
		while (i >= 0) {
			result += a[i];
			i--;
		}
		System.out.print(result);
	}
}