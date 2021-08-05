package A_BasicSyntax;

public class E2_FloatError {
	public static void main(String[] args) {
		double num = 0.1;
		for(int i = 0; i < 1000; i++) {
		    num += 0.1;
		}
		System.out.print(num);
	}
}
