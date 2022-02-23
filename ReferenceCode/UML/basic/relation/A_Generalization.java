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

public class A_Generalization {
	public static void main(String[] args) {
		Start s = new Start(1, 11);
		Start s2 = new Start(2, 22);

		s.show();
		s2.show();
	}
}

class End {
	protected int ID;

	int getID() {
		return ID;
	}
}

class Start extends End {
	private int PW;

	Start(int ID, int PW) {
		this.PW = PW;
		this.ID = ID;
	}

	public void show() {
		System.out.println("Generalization : " + this.getID() + " / " + PW);
	}
}