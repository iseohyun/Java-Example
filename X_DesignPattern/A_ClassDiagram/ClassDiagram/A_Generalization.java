package ClassDiagram;

/**
 * 
 * @author Seohyun Jung
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