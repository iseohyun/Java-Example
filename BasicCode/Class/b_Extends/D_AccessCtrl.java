package b_Extends;

import origin.Origin2;

/**
 * 
 * ����������
 *
 *	4���� �������� ����� �ֽ��ϴ�.
 *
 *	private			����� : ���� ��밡��
 *	protected		��ӿ��� publicó�� ��밡��
 *	(�ۼ����� ����)	��Ű���� �޶����� ������ ���� ����
 *	public			���� �׷��� ����
 *
 */

@SuppressWarnings("unused")
class Origin {
	public 		String Pub = "public";
	protected	String Pro = "Protected";
	/*default*/	String Def = "Package Private";
	private		String Pri = "Private";
}

class Extend extends Origin{
	Extend(){
		// Private�� ���� �� �� ����!
		Pub += "+";
		Def += "+";
		Pro += "+";
	}
}

class Extend2 extends Origin2{
	Extend2(){
		// �ٸ� ��Ű���� Origin�� ��ӹ޾ұ� ������ default�� ���ܵȴ�.
		Pub += "++";
		Pro += "++";
	}
}


public class D_AccessCtrl {
	public static void main(String[] args) {
		Origin ori = new Origin();
		Extend ext = new Extend();
		Extend2 ext2 = new Extend2();
		
		System.out.println();
		System.out.println(ori.Pub);
		System.out.println(ori.Pro);
		System.out.println(ori.Def);
		
		System.out.println();
		System.out.println(ext.Pub);
		System.out.println(ext.Pro);
		System.out.println(ext.Def);
		
		System.out.println();
		System.out.println(ext2.Pub);
	}
}

