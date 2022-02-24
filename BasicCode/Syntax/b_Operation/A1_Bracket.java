package b_Operation;

public class A1_Bracket {
	public static void main(String[] args) {
		int num = 2, num1, num2;
		num1 = 2 * num + 2;
		num2 = 2 * (num + 2);

		System.out.println("2 + " + num + " x 2 = " + num1);
		System.out.println("(2 + " + num + ") x 2 = " + num2);
	}
}