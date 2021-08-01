package C_CtrlStatement;

public class E1_Quiz {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 || i % 7 == 0) {
				System.out.println(i);
			} else {
				continue;
			}
		}
	
		System.out.println("--------------------");
		int n = 1, sum = 0;
	
		while (true) { // 무한 루프
			sum += n;
			if (n == 100) {
				break;
			}
			n++;
		}
		System.out.println(sum);
	}

}
