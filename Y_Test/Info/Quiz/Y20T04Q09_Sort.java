package Quiz;


// 출력결과가 다음과 같습니다. 빈칸에 채우세요.
//	1 4 7 10 13
//	2 5 8 11 14
//	3 6 9 12 15

public class Y20T04Q09_Sort {	
	public static void main(String[] args) {
		int[][] arry = new int[/*?*/3][/*?*/5];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				arry[i][j] = j * 3 + (i + 1);
				System.out.print(arry[i][j]+" ");
			}
			System.out.println();
		}
	}
}