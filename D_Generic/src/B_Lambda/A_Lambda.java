package B_Lambda;

public class A_Lambda {
	public static void main(String[] args) {
		A a1 = new A() {};
		A a2 = new A() { public void a(String s) {System.out.println("A* : "+s);}};
		a1.a("�������̵� ����");
		a2.a("�������̵� ��\n");
		
		B b1 = new B() { public void b(String s) {System.out.println("B* : "+s);}};
		B b2 = (String s) -> {System.out.println("B*2: "+s);};
		B b3 = (s)->{System.out.println("B*3: "+s);};
		B b4 = (s)->System.out.println("B*4: "+s);
		
		b1.b("������ �ʿ�");
		b2.b("�Լ��� �ϳ���, �Լ� �� ����");
		b3.b("���� ����");
		b4.b("��ȣ ����");
	}
}

interface A{
	default void a(String s) {System.out.println("A  : "+s);}
}

interface B{
	void b(String s);
}
