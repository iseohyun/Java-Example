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
		System.out.println("현재속도 : " + speed + " km");
		accel();
		System.out.println("현재속도 : " + speed + " km");
		accel();
		System.out.println("현재속도 : " + speed + " km");
		brake();
		System.out.println("현재속도 : " + speed + " km");
	}
}
