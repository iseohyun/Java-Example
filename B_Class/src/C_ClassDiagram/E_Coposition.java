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
 * Aggregation(����)			start ����-��������������������	End	[1 : 0..*]
 * 			  (���տ���)		start ����-������������������>	End
 * Composition(�ռ�)			start ����-��������������������	End
 * 			  (���տ���)		start ����-������������������>	End
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