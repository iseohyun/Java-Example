package C_ClassDiagram;

/**
 * 
 * @author Seohyun Jung
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
		Start_C s = new Start_C();
		End_C e = new End_C(1);
		End_C e2 = new End_C(2);
		s.show(e);
		s.show(e2);
	}
}

class End_C {
	private int ID;

	End_C(int ID) {
		this.ID = ID;
	}

	public int getID() {
		return ID;
	}
}

class Start_C {
	public void show(End_C end) {
		System.out.println("Dependency : " + end.getID());
	}
}