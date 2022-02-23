package basic.relation;

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

public class E_Composition {
	public static void main(String[] args) {
		Group s = new Group(1);
		s.show();

		s = new Group(2);
		s.show();
	}
}

class Member {
	private int ID;

	Member(int ID) {
		this.ID = ID;
	}

	public int getID() {
		return ID;
	}
}

class Group {
	Member member;

	Group(int ID) {
		member = new Member(ID);
	}

	public void show() {
		System.out.println("Composition : " + member.getID());
	}
}