package B_Class;

public class A3_IfNoClass {
	static int speed = 0;
	public static void accel() {
		speed += 10;
	}
	public static void brake() {
		speed = 0;
	}
	
	public static void main(String[] args) {
		System.out.println("����ӵ� : " + speed + " km");
		accel();
		System.out.println("����ӵ� : " + speed + " km");
		accel();
		System.out.println("����ӵ� : " + speed + " km");
		brake();
		System.out.println("����ӵ� : " + speed + " km");
	}
}
