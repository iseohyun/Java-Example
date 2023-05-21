package structural.composite;

import java.util.List;
import java.util.ArrayList;

/**
 *	출처 : https://ko.wikipedia.org/wiki/%EC%BB%B4%ED%8F%AC%EC%A7%80%ED%8A%B8_%ED%8C%A8%ED%84%B4
 *
 * @author Seohyun Jung
 *
 *		컴포지트 패널 : 하위 객체를 다루기 위해서 컴포지트(Composite)를 사용하는데, 컴포지트 역시 컴포짓의 멤버로 들어갈 수 있다.
 *			기존의 코드의 수정을 최소화 하면서 단일 객체를 생성 할 수 있다는 장점이 있다. 
 *
 *		코드해설)
 *		Eclipse 1,2,3,4 -> Composite II 	-> Composite I
 *		Eclipse 4		-> Composite III	↑
 *
 *		** 원본 예제에서 Coposite I을 수행하면 하나의 리스트로 통합이 되어 있는 것 처럼 보이지만 사실은,
 *		두개의 리스트가 연속해서 출력하는 결과이다.
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