package Quiz;


// 대소문자를 구분하여 채우세요.
//	처리결과 : 00001010

public class Y20T04Q10_while {	
	public static void main(String[] args) {
		int a[] = new int[8];
		int i = 0, n = 10;
		while(/*****/8 - i != 0) {
			a[i++] = /****/n % 2;
			n /= 2;
		}
		for(i = 7; i >= 0; i--)
			System.out.printf("%d", a[i]);
	}
}