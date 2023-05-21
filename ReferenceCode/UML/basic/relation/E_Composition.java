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

public class E_Composition {
    public static void main(String[] args) {
        Group s = new Group(1);
        s.show();

        s = new Group(2);
        s.show();
    }
}

class Member {
    private int ID;

    Member(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }
}

class Group {
    Member member;

    Group(int ID) {
        member = new Member(ID);
    }

    public void show() {
        System.out.println("Composition : " + member.getID());
    }
}