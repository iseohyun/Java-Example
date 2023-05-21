package basic.relation;

/**
 * 
 * Generalization(일반화)       Start ───────────▷ End
 * Realization(실체화)          Start -----------▷ End
 * Dependency(의존)             Start -----------> End
 * Association(연관)            Start ──────────── End
 * Directed Association(직접)   Start ───────────> End
 * Aggregation(집합)            start ──────────◁▷ End
 *            (집합연관)        start -─────────◁▷ End
 * Composition(합성)            start ──────────◀▶ End
 *            (복합연관)        start -─────────◀▶ End
 */

public class A_Generalization {
    public static void main(String[] args) {
        Start s = new Start(1, 11);
        Start s2 = new Start(2, 22);

        s.show();
        s2.show();
    }
}

class End {
    protected int ID;

    int getID() {
        return ID;
    }
}

class Start extends End {
    private int PW;

    Start(int ID, int PW) {
        this.PW = PW;
        this.ID = ID;
    }

    public void show() {
        System.out.println("Generalization : " + this.getID() + " / " + PW);
    }
}