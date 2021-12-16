package basic.relation;

/**
 * 
 * Generalization(일반화)		Start ───────▷	End
 * Realization(실체화)		Start ------------▷	End
 * Dependency(의존)			Start ------------>	End
 * Association(연관)			Start ─────────────	End
 * Directed Association(직접)Start ────────────>	End
 * Aggregation(집합)			start ◁▷-──────────	End
 * 			  (집합연관)		start ◁▷-─────────>	End
 * Composition(합성)			start ◀▶-──────────	End
 * 			  (복합연관)		start ◀▶-─────────>	End
 */

public class C_Dependency {
	public static void main(String[] args) {
		Depend s = new Depend();
		Origin e = new Origin(1);
		Origin e2 = new Origin(2);
		s.show(e);
		s.show(e2);
	}
}

class Origin {
	private int ID;

	Origin(int ID) {
		this.ID = ID;
	}

	public int getID() {
		return ID;
	}
}

class Depend {
	public void show(Origin end) {
		System.out.println("Dependency : " + end.getID());
	}
}