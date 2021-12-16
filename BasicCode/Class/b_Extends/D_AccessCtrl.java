package b_Extends;

import origin.Origin2;

/**
 * 
 * 접근제어자
 *
 *	4가지 접근제어 방식이 있습니다.
 *
 *	private			비공개 : 나만 사용가능
 *	protected		상속에는 public처럼 사용가능
 *	(작성하지 않음)	패키지가 달라지면 접근이 되지 않음
 *	public			제한 그런것 없음
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
		// Private은 접근 할 수 없다!
		Pub += "+";
		Def += "+";
		Pro += "+";
	}
}

class Extend2 extends Origin2{
	Extend2(){
		// 다른 패키지의 Origin을 상속받았기 때문에 default가 제외된다.
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

