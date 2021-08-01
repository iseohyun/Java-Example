package B_Class;

class CarLimitChk{
	// speed 0< limit < 150
	private int speed = 0;
	void accel(int AccSpd) {
		speed+=AccSpd; 
		if(speed<0) {
			speed=0;
		}else if(speed>150){
			speed=150;
		}
	}
	int getSpeed() {
		return speed;
	}
}

public class E1_LimitCheck {
	public static void main(String[] args) {
		CarLimitChk car1 = new CarLimitChk();
		car1.accel(100);
		System.out.println("Speed : "+ car1.getSpeed());
		car1.accel(100);
		System.out.println("Speed : "+ car1.getSpeed());
		car1.accel(-100);
		System.out.println("Speed : "+ car1.getSpeed());
		car1.accel(-100);
		System.out.println("Speed : "+ car1.getSpeed());
	}
}