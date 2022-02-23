package d_Math;

public class B_Examples {
	public static void main(String args[]) {
		System.out.println(Math.abs(-1));
		System.out.println("------------round");
		System.out.println(Math.ceil(1.1));
		System.out.println(Math.floor(1.1));
		System.out.println(Math.round(1.5));
		System.out.println("------------power");
		System.out.println(Math.sqrt(2));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.pow(2, 0.5));
		System.out.println(Math.exp(2));
		System.out.println(Math.pow(Math.E, 2));
		System.out.println("------------sin");
		System.out.println(Math.sin(30));
		System.out.println(Math.sin(Math.toRadians(30)));
		System.out.println(Math.acos(0.5));
		System.out.println(Math.toDegrees(Math.acos(0.5)));
	}
}