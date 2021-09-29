package Composite;

import java.util.List;
import java.util.ArrayList;

/**
 *	��ó : https://ko.wikipedia.org/wiki/%EC%BB%B4%ED%8F%AC%EC%A7%80%ED%8A%B8_%ED%8C%A8%ED%84%B4
 *
 * @author Seohyun Jung
 *
 *		������Ʈ �г� : ���� ��ü�� �ٷ�� ���ؼ� ������Ʈ(Composite)�� ����ϴµ�, ������Ʈ ���� �������� ����� �� �� �ִ�.
 *			������ �ڵ��� ������ �ּ�ȭ �ϸ鼭 ���� ��ü�� ���� �� �� �ִٴ� ������ �ִ�. 
 *
 *		�ڵ��ؼ�)
 *		Eclipse 1,2,3,4 -> Composite II 	-> Composite I
 *		Eclipse 4		-> Composite III	��
 *
 *		** ���� �������� Coposite I�� �����ϸ� �ϳ��� ����Ʈ�� ������ �Ǿ� �ִ� �� ó�� �������� �����,
 *		�ΰ��� ����Ʈ�� �����ؼ� ����ϴ� ����̴�.
 *
 */

public class Client {
	public static void main(String[] args) {
		Ellipse ellipse1 = new Ellipse("One");
		Ellipse ellipse2 = new Ellipse("Two");
		Ellipse ellipse3 = new Ellipse("Three");
		Ellipse ellipse4 = new Ellipse("Four");

		CompositeGraphic graphic = new CompositeGraphic("I");
		CompositeGraphic graphic1 = new CompositeGraphic("II");
		CompositeGraphic graphic2 = new CompositeGraphic("III");

		graphic1.add(ellipse1);
		graphic1.add(ellipse2);
		graphic1.add(ellipse3);
		graphic2.add(ellipse4);

		graphic.add(graphic1);
		graphic.add(graphic2);

		graphic.print();
	}
}

interface Graphic {
	public void print();
}

class CompositeGraphic implements Graphic {
	private String ID;

	CompositeGraphic(String ID) {
		this.ID = ID;
	}

	private List<Graphic> mChildGraphics = new ArrayList<Graphic>();

	public void print() {
		System.out.println(this + " - " + ID);
		for (Graphic graphic : mChildGraphics) {
			graphic.print();
		}
	}

	public void add(Graphic graphic) {
		mChildGraphics.add(graphic);
	}

	public void remove(Graphic graphic) {
		mChildGraphics.remove(graphic);
	}
}

class Ellipse implements Graphic {
	private String ID;

	Ellipse(String ID) {
		this.ID = ID;
	}

	public void print() {
		System.out.println("Ellipse " + ID);
	}
}