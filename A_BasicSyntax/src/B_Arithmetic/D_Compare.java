package B_Arithmetic;

public class D_Compare {
	public static void main(String[] args) {
		int a = 2, b = 3;

		System.out.println("1 : " + (a < b));
		System.out.println("2 : " + (a > b));
		System.out.println("3 : " + !(a > b));
		System.out.println("4 : " + ((a < b) && (a > b)));
		System.out.println("5 : " + ((a < b) || (a > b)));
	}
}
