package ClassDiagram;

import java.util.ArrayList;
import java.util.List;

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

public class D_Association{
	public static void main(String[] args) {
		End_D end = new End_D();
		Start_D[] starts = new Start_D[10];
		
		for(int i = 0; i < starts.length; i++) {
			starts[i] = new Start_D(i);
			starts[i].setD(end);
		}
		
		for(int i = 0; i < starts.length; i++) {
			System.out.println("Association : " + end.get(i).id());
		}
	}
}

class End_D{
	private List<Start_D> ds = new ArrayList<>();
	public void addD(Start_D d) {
		ds.add(d);
	}
	public Start_D get(int i) {
		return ds.get(i);
	}
}

@SuppressWarnings("unused")
class Start_D{
	private int ID;
	public Start_D(int s) { ID = s; }
	public int id() { return ID; }

	private End_D end;
	public void setD(End_D end) {
		this.end = end;
		end.addD(this);
	}
}