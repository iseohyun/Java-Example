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

public class B_Realization {
	public static void main(String[] args) {
		End_B b1 = new Start_B();
		End_B b2 = new Start_B2();

		b1.func();
		b2.func();
	}
}

interface End_B {
	void func();
}

class Start_B implements End_B {
	@Override
	public void func() {
		System.out.println("Realization 1");
	}
}

class Start_B2 implements End_B {
	@Override
	public void func() {
		System.out.println("Realization 2");
	}
}