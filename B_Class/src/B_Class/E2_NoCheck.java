package B_Class;

class CarNoChk{
	// speed 0< limit < 150
	int speed = 0;
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

public class E2_NoCheck {
	public static void main(String[] args) {
		CarNoChk car1 = new CarNoChk();
		car1.accel(100);
		System.out.println("Speed : "+ car1.getSpeed());
		car1.speed = 200;
		System.out.println("Speed : "+ car1.getSpeed());
		car1.accel(-100);
		System.out.println("Speed : "+ car1.getSpeed());
		car1.speed = -100;
		System.out.println("Speed : "+ car1.getSpeed());
	}
}