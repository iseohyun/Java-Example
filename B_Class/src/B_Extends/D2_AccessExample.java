package B_Extends;

import B2_OuterClass.*;

/**
 * 
 *	X_AccessCtrl�� D2_OuterClass�� �����Ͽ� �ۼ��Ǿ����ϴ�.
 *	D2_OuterClass ���� OuterAcc Ŭ������ �����غ���, ���غ��ô�.
 *
 *	B_Extends ��Ű��
 *		Z_AccessCtrl <- Child
 *
 *	�ܺ� ��Ű�� (B2_OuterClass)
 *		OuterClass <- OuterClassEx
 *
 */

public class D2_AccessExample {
	static class Child extends Z_AccessCtrl {
		Child() {
			who = "Child";
		}
	}

	public static void main(String[] args) {
		Z_AccessCtrl ac = new Z_AccessCtrl();
		ac.printPublic();
		ac.printProtected();
		ac.printDefault();
		// ac.printPrivate();

		Child ch = new Child();
		ch.printPublic();
		ch.printProtected();
		ch.printDefault();

		OuterClass oc = new OuterClass();
		oc.printPublic();
		oc.printProtected();
		// oc.printDefault();

		OuterClassEx ocx = new OuterClassEx();
		ocx.acx.who = "Out(Ex)";
		ocx.acx.printPublic();
		ocx.acx.printProtected();
		ocx.acx.printDefault();
		// ocx.ac.printprotected();
	}
}