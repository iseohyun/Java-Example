package visitor;

/**
 * 
 * 출처 : https://ko.wikipedia.org/wiki/%EB%B9%84%EC%A7%80%ED%84%B0_%ED%8C%A8%ED%84%B4
 * 
 * @author Seohyun Jung
 *
 *		알고리즘을 객체 구조와 분리
 *
 */

public class Client {
	static public void main(String[] args) {
		Car car = new Car();
		car.accept(new CarElementPrintVisitor());
		car.accept(new CarElementDoVisitor());
	}
}

interface CarElementVisitor {
	void visit(Wheel wheel);

	void visit(Engine engine);

	void visit(Body body);

	void visit(Car car);
}

interface CarElement {
	void accept(CarElementVisitor visitor); // CarElements have to provide accept().
}

class Wheel implements CarElement {
	private String name;

	public Wheel(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void accept(CarElementVisitor visitor) {
		visitor.visit(this);
	}
}

class Engine implements CarElement {
	public void accept(CarElementVisitor visitor) {
		visitor.visit(this);
	}
}

class Body implements CarElement {
	public void accept(CarElementVisitor visitor) {
		visitor.visit(this);
	}
}

class Car implements CarElement {
	CarElement[] elements;

	public CarElement[] getElements() {
		return elements.clone(); // Return a copy of the array of references.
	}

	public Car() {
		this.elements = new CarElement[] { new Wheel("front left"), new Wheel("front right"), new Wheel("back left"),
				new Wheel("back right"), new Body(), new Engine() };
	}

	public void accept(CarElementVisitor visitor) {
		for (CarElement element : this.getElements()) {
			element.accept(visitor);
		}
		visitor.visit(this);
	}
}

class CarElementPrintVisitor implements CarElementVisitor {
	public void visit(Wheel wheel) {
		System.out.println("Visiting " + wheel.getName() + " wheel");
	}

	public void visit(Engine engine) {
		System.out.println("Visiting engine");
	}

	public void visit(Body body) {
		System.out.println("Visiting body");
	}

	public void visit(Car car) {
		System.out.println("Visiting car");
	}
}

class CarElementDoVisitor implements CarElementVisitor {
	public void visit(Wheel wheel) {
		System.out.println("Kicking my " + wheel.getName() + " wheel");
	}

	public void visit(Engine engine) {
		System.out.println("Starting my engine");
	}

	public void visit(Body body) {
		System.out.println("Moving my body");
	}

	public void visit(Car car) {
		System.out.println("Starting my car");
	}
}