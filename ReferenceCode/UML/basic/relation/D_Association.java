package basic.relation;

import java.util.ArrayList;
import java.util.List;

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

public class D_Association {
    public static void main(String[] args) {
        ArrayUnit end = new ArrayUnit();
        Unit[] starts = new Unit[10];

        for (int i = 0; i < starts.length; i++) {
            starts[i] = new Unit(i);
            starts[i].setD(end);
        }

        for (int i = 0; i < starts.length; i++) {
            System.out.println("Association : " + end.get(i).getId());
        }
    }
}

class ArrayUnit {
    private List<Unit> ds = new ArrayList<>();

    public void addD(Unit unit) {
        ds.add(unit);
    }

    public Unit get(int index) {
        return ds.get(index);
    }
}

@SuppressWarnings("unused")
class Unit {
    private int ID;

    public Unit(int ID) {
        this.ID = ID;
    }

    public int getId() {
        return ID;
    }

    private ArrayUnit end;

    public void setD(ArrayUnit end) {
        this.end = end;
        end.addD(this);
    }
}