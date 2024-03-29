package structural.composite.origin;

import java.util.List;
import java.util.ArrayList;

/**
 *	출처 : https://ko.wikipedia.org/wiki/%EC%BB%B4%ED%8F%AC%EC%A7%80%ED%8A%B8_%ED%8C%A8%ED%84%B4
 *
 * @author Seohyun Jung
 *
 */

public class Client {
    public static void main(String[] args) {
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();

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
    private List<Graphic> mChildGraphics = new ArrayList<Graphic>();

    public void print() {
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
    public void print() {
        System.out.println("Ellipse");
    }
}