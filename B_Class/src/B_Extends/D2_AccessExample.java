package B_Extends;

import B2_OuterClass.*;

/**
 * 
 *	X_AccessCtrl과 D2_OuterClass와 연개하여 작성되었습니다.
 *	D2_OuterClass 이하 OuterAcc 클레스를 실행해보고, 비교해봅시다.
 *
 *	B_Extends 패키지
 *		Z_AccessCtrl <- Child
 *
 *	외부 패키지 (B2_OuterClass)
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