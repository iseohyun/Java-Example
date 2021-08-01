package B_Class;

class car {
	int speed;
	void accel() {
		speed += 10;
	}
	void brake() {
		speed = 0;
	}
	int getSpeed(){
		return speed;
	}
}

public class A1_Class {
	public static void main(String[] args) {
		car car1 = new car();
		System.out.println("현재속도 : " + car1.speed + "km");
		car1.accel();
		System.out.println("현재속도 : " + car1.speed + "km");
		car1.accel();
		System.out.println("현재속도 : " + car1.speed + "km");
		car1.brake();
		System.out.println("현재속도 : " + car1.speed + "km");
	}
}
