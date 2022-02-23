package a_Object;

// ���� : �ݵ�� Cloneable�� implements�ؾ��Ѵ�.
class Class1 implements Cloneable{
	String str;
	Class1(String str) { this.str = str; }
	
	public Object clone() {
		try {
			return (Class1) super.clone();	// �ٽ�
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}

public class C_Clone implements Cloneable{
	public static void main(String[] args)  {
		Class1 c1 = new Class1("First");
		System.out.println(c1 + " ===> " + c1.str);
		
		// ������ ���簡 ������ �ٸ� Ŭ������ �����ȴ�.
		Class1 c2 = (Class1) c1.clone();
		System.out.println(c2 + " ===> " + c2.str);
		
		// ������ �ٲٸ� ���� �ٸ� Ŭ������ �ȴ�.
		c2.str = "Second";
		System.out.println(c1 + " ===> " + c1.str);
		System.out.println(c2 + " ===> " + c2.str);
	}
}