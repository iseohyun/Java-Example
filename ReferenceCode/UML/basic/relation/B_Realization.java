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