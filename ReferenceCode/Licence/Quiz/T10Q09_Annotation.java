package Quiz;

abstract class Shapes {
	abstract public void area();
}

class Circle extends Shapes {
	int r;
	
	public Circle(int r) {
		this.r = r;
	}
	
	/***?***/
	@Override
	public void area() {
		System.out.println("원의 넓이 :" + Math.PI * r *r);
	}
}
class Rectangle extends Shapes {
	int w;
	int h ;
	
	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}

	@Override
	public void area() {
		System.out.println("직사각형의 넓이 : " + w * h) ;
	}
}

public class T10Q09_Annotation {
	public static void main(String[] args) {
		Circle s1 = new Circle(1);
		s1.area();
		
		Rectangle s2 = new Rectangle(3, 5);
		s2.area();
	}
}