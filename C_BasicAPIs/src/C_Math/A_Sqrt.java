package C_Math;

public class A_Sqrt {
	public static void main(String[] args) {
		System.out.println("Pi : " + Math.PI);
		System.out.println("e  : " + Math.E);

		double r = 3;
		double h = 10;

		// 參創檜 : s = 2(r^2)PI + 2rhPI
		double s = 2 * Math.sqrt(r) * Math.PI + 2 * r * h * Math.PI;

		// 奩雖葷 : v = 2(r^2)hPI
		double v = 2 * Math.sqrt(r) * h * Math.PI;

		System.out.println("參創檜 : " + s + ", 睡Я : " + v);
	}
}