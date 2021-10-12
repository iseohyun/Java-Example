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
 * Aggregation(집합)			start ◁▷-──────────	End	[1 : 0..*]
 * 			  (집합연관)		start ◁▷-─────────>	End
 * Composition(합성)			start ◀▶-──────────	End
 * 			  (복합연관)		start ◀▶-─────────>	End
 */

public class E_Coposition {
	public static void main(String[] args) {
		Start_E s = new Start_E(1);
		s.show();

		s = new Start_E(2);
		s.show();
	}
}

class End_E {
	private int ID;

	End_E(int ID) {
		this.ID = ID;
	}

	public int getID() {
		return ID;
	}
}

class Start_E {
	End_E end;

	Start_E(int ID) {
		end = new End_E(ID);
	}

	public void show() {
		System.out.println("Coposition : " + end.getID());
	}
}