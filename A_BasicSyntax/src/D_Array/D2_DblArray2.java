package D_Array;

public class D2_DblArray2 {
	public static void main(String[] args) {
		int[][] arr = {
			{100, 200},
			{300, 400, 500, 600},
			{700, 800, 900},
			{1000}
		};

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		// TODO : 아래와 같이 출력되도록 변경해보세요.
		// hint : 읽어오세요. -> x/100 -> x*x
		//1 4 
		//9 16 25 36 
		//49 64 81 
		//100 
	}
}