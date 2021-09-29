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

public class B_Realization {
	public static void main(String[] args) {
		End_B b1 = new Start_B();
		End_B b2 = new Start_B2();

		b1.func();
		b2.func();
	}
}

interface End_B {
	void func();
}

class Start_B implements End_B {
	@Override
	public void func() {
		System.out.println("Realization 1");
	}
}

class Start_B2 implements End_B {
	@Override
	public void func() {
		System.out.println("Realization 2");
	}
}