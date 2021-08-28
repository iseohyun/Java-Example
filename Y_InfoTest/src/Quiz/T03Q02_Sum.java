package Quiz;
/*
 * 분석결과를 쓰시오.
 * 
 */
public class T03Q02_Sum {
	public static void main(String[] args) {
		int n = 0;
		int num = 110;
		for(int i = 1; i <= num; i++) {
			if(i%4==0) n++;
		}
		System.out.println(n);
	}
}
