package ClassDiagram;

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

public class A_Generalization {
	public static void main(String[] args) {
		Start_A s = new Start_A(1, 11);
		Start_A s2 = new Start_A(2, 22);

		s.show();
		s2.show();
	}
}

class End_A {
	int ID;

	int getID() {
		return ID;
	}
}

class Start_A extends End_A {
	private int PW;

	Start_A(int ID, int PW) {
		this.PW = PW;
		this.ID = ID;
	}

	public void show() {
		System.out.println("Generalization : " + this.getID() + " / " + PW);
	}
}