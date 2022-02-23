package create.factoryMethod;

/**
 * 
 * @author Seohyun Jung
 *
 *		���丮 �޼��� : �߻� Ŭ������ �̿��Ͽ�, ���ϰ��� �ϴ� Ŭ������ �����ϴ� ���
 *			���������, new�����ڸ� �̿��ؾ� �ν��Ͻ��� �����ȴٴ� ���� �����ؾ� �մϴ�.
 *
 *		�ڵ� ����)
 *			Object�� ����ũ�̰�, GetObj���� ������ �����ϰ����ϴ� �޼��带 �����ϴ� ���
 *			��������, �����ϰ��� �ϴ� class�� ������� �ʴ´ٴ� ��
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