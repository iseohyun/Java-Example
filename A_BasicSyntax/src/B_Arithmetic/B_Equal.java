package B_Arithmetic;

public class B_Equal {
	public static void main(String[] args) {
		int a = 3;
		int res1, res2;

		res1 = res2 = 1;
		res1 = res1 + a;
		res2 += a;
		System.out.println("1 : " + res1 + " / " + res2);

		res1 = res2 = 10;
		res1 = res1 - a;
		res2 -= a;
		System.out.println("2 : " + res1 + " / " + res2);

		res1 = res2 = 10;
		res1 = res1 % a;
		res2 %= a;
		System.out.println("3 : " + res1 + " / " + res2);
	}
}
