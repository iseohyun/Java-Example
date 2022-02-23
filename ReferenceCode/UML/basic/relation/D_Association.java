package basic.relation;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Generalization(�Ϲ�ȭ)		Start ����������������	End
 * Realization(��üȭ)		Start ------------��	End
 * Dependency(����)			Start ------------>	End
 * Association(����)			Start ��������������������������	End 
 * Directed Association(����)Start ������������������������>	End
 * Aggregation(����)			start ����-��������������������	End	[1 : 0..*]
 * 			  (���տ���)		start ����-������������������>	End
 * Composition(�ռ�)			start ����-��������������������	End
 * 			  (���տ���)		start ����-������������������>	End
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