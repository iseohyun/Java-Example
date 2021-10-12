package C_ClassDiagram;

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