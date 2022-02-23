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

public class B_Realization {
	public static void main(String[] args) {
		Irreal b1 = new Real1();
		Irreal b2 = new Real2();

		b1.func();
		b2.func();
	}
}

interface Irreal {
	void func();
}

class Real1 implements Irreal {
	@Override
	public void func() {
		System.out.println("Realization 1");
	}
}

class Real2 implements Irreal {
	@Override
	public void func() {
		System.out.println("Realization 2");
	}
}