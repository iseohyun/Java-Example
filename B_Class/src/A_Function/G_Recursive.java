package A_Function;

public class G_Recursive {
	public static void main(String[] args) {
		int sum;
		sum = recursiveSum(100);
		System.out.printf("Sum : " + sum);
	}

	static int recursiveSum(int n) {
		if (n == 1) {
			return 1;
		}
		return n + recursiveSum(n - 1);
	}
}