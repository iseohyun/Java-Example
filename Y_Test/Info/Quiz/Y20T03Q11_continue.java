package Quiz;

public class Y20T03Q11_continue {	
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while ( i < 10 ){
			i++;
			if( i%2 == 1 )
				continue;
			sum += i;
		}
		System.out.print(sum) ;
	}
}

// 2, 4, 6, 8, 10