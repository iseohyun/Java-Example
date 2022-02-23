package create.factoryMethod;

/**
 * 
 * @author Seohyun Jung
 *
 *		팩토리 메서드 : 추상 클레스를 이용하여, 원하고자 하는 클래스를 생성하는 방법
 *			결론적으로, new연산자를 이용해야 인스턴스가 생성된다는 점에 주의해야 합니다.
 *
 *		코드 설명)
 *			Object는 훼이크이고, GetObj에서 실제로 생성하고자하는 메서드를 생성하는 방법
 *			장점으로, 생성하고자 하는 class가 노출되지 않는다는 점
 *		
 */

public class Client {
	public static void main(String[] args) {
		System.out.println(Object.GetObj(Object.Types.T1).GetContents());
		System.out.println(Object.GetObj(Object.Types.T2).GetContents());
		System.out.println(Object.GetObj(Object.Types.T3).GetContents());
	}
}

abstract class Object {
	public abstract String GetContents();

	public enum Types {
		T1, T2, T3
	}

	public static Object GetObj(Types t) {
		switch (t) {
		case T1:
			return new T1_Obj();
		case T2:
			return new T2_Obj();
		case T3:
			return new T3_Obj();
		}
		return new T1_Obj();
	}
}

class T1_Obj extends Object {
	@Override
	public String GetContents() {
		return "Type 1 : Factory Method";
	}
}

class T2_Obj extends Object {
	@Override
	public String GetContents() {
		return "Type 2 : Factory Method";
	}
}

class T3_Obj extends Object {
	@Override
	public String GetContents() {
		return "Type 3 : Factory Method";
	}
}