package Quiz;
/*
 * 분석결과를 쓰시오.
 * 
 */
public class T07Q02_for {
	public static void main(String[] args) {
		int []a = new int[5];
		int sum = 0;
		for(int i = 0; i < 5; i++ ) {
			a[i] = i + 1;
		}
		
		for(int i : a) {
			sum += i;
		}
		
		System.out.print(sum);
	}
}