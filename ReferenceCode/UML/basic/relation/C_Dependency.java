package basic.relation;

/**
 * 
 * Generalization(�Ϲ�ȭ)		Start ����������������	End
 * Realization(��üȭ)		Start ------------��	End
 * Dependency(����)			Start ------------>	End
 * Association(����)			Start ��������������������������	End
 * Directed Association(����)Start ������������������������>	End
 * Aggregation(����)			start ����-��������������������	End
 * 			  (���տ���)		start ����-������������������>	End
 * Composition(�ռ�)			start ����-��������������������	End
 * 			  (���տ���)		start ����-������������������>	End
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