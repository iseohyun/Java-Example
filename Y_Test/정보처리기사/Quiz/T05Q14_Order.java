package Quiz;
/*
 * 분석결과를 쓰시오.
 * 
 */
public class T05Q14_Order {
	public static void main(String[] args) {
		int a, b, c, sum;
		a = b = 1;
		sum = a + b;
		for(int i = 3; i <= 5; i++) {
			c = a + b;
			sum += c;
			a = b;
			b = c;
		}
		
		System.out.println(sum);
	}
}
// 1, 1, 2, 3, 5 = 12