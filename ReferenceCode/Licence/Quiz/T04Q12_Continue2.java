package Quiz;
/*
 * 분석결과를 쓰시오.
 * 
 */
public class T04Q12_Continue2 {
	public static void main(String[] args) {
		int a = 1, b = 43, c = 3;
		int temp;
		
		temp = a;
		if(b > temp) temp = b;
		if(c > temp) temp = c;
		
		System.out.println(temp);
	}
}
