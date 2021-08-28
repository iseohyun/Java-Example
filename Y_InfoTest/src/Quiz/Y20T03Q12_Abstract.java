package Quiz;

abstract class Vehicle {
	String name;
	abstract public String getName(String val);
	
	public Vehicle(String val) {
		this.name = val;
	}
	
	public String getName() {
		return "Vehicle name : " + name;
	}
}

class Car extends Vehicle {
	public Car(String val) {
		super(val);	// name = super.name = val;
	}

	public String getName(String val) {
		return "Car name : " + val;
	}
}

public class Y20T03Q12_Abstract {	
	public static void main(String[] args) {
		Vehicle obj = new Car("Spark");
		System.out.print(obj.getName());
	}
}