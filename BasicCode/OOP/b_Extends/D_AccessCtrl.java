package b_Extends;

import test_Answer.C;

/**
 * 
 * ����������
 *
 * private (-) ����� : ���� ��밡�� protected (#) ��ӿ��� publicó�� ��밡�� (�ۼ����� ����) (~) ��Ű����
 * �޶����� ������ ���� ����(package protected) public (+) ���� ����
 *
 */

class A {
	private String Pri = "-";
	protected String Pro = "#";
	/* p.p */ String PP = "~";
	public String Pub = "+";

	String direct() {
		return Pri + ", " + Pro + ", " + PP + ", " + Pub;
	}
}

class B extends A {
}

class D extends C {
	public String Pro = super.Pro;
}

public class D_AccessCtrl {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();

		System.out.print("> ���� ��� : ");
		System.out.println(a.direct());

		System.out.print("> ����Ͽ� ��� : ");
		System.out.print(b.Pro + ", ");
		System.out.print(b.PP + ", ");
		System.out.println(b.Pub);

		System.out.print("> ��Ű���� �ٸ� ����Ͽ� ��� : ");
		System.out.print(d.Pro + ", "); // ���� : ��Ű�� �ʿ����� ��밡��
		System.out.println(d.Pub);

		System.out.print("> ��Ű���� �ٸ� ��ӹ��� ���� ��� : ");
		System.out.print(c.Pub + ", ");

	}
}