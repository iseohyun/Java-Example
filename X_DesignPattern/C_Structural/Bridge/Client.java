package Bridge;
/**
 * 출처 : https://ko.wikipedia.org/wiki/%EB%B8%8C%EB%A6%AC%EC%A7%80_%ED%8C%A8%ED%84%B4
 * 
 * @author Seohyun Jung
 *
 *		브릿지 패턴 : 구현하고자 하는 대상을 여러단계(레이어)로 나누어서 구현
 *
 *		코드 해석)
 *			최종 구현할 대상 : Shape
 *
 *			1) draw			-> DrawingAPI(DrawingAPI1, DrawingAPI2...)
 *			2) resize
 *
 */

public class Client {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new CircleShape(1, 2, 3, new DrawingAPI1());
		shapes[1] = new CircleShape(5, 7, 11, new DrawingAPI2());

		for (Shape shape : shapes) {
			shape.resize(2.5);
			shape.draw();
		}
	}
}

interface Shape {
	public void draw(); // level 1

	public void resize(double pct); // level 2
}

class CircleShape implements Shape {
	private double x, y, radius;
	private DrawingAPI drawingAPI;

	public CircleShape(double x, double y, double radius, DrawingAPI drawingAPI) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.drawingAPI = drawingAPI;
	}

	public void draw() {
		drawingAPI.drawCircle(x, y, radius);
	}

	public void resize(double pct) {
		radius *= pct;
	}
}

interface DrawingAPI {
	public void drawCircle(double x, double y, double radius);
}

class DrawingAPI1 implements DrawingAPI {
	public void drawCircle(double x, double y, double radius) {
		System.out.printf("API1.circle at %f:%f radius %f\n", x, y, radius);
	}
}

class DrawingAPI2 implements DrawingAPI {
	public void drawCircle(double x, double y, double radius) {
		System.out.printf("API2.circle at %f:%f radius %f\n", x, y, radius);
	}
}