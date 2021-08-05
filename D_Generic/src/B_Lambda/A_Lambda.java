package B_Lambda;

public class A_Lambda {
	public static void main(String[] args) {
		A a1 = new A() {};
		A a2 = new A() { public void a(String s) {System.out.println("A* : "+s);}};
		a1.a("오버라이딩 안함");
		a2.a("오버라이딩 함\n");
		
		B b1 = new B() { public void b(String s) {System.out.println("B* : "+s);}};
		B b2 = (String s) -> {System.out.println("B*2: "+s);};
		B b3 = (s)->{System.out.println("B*3: "+s);};
		B b4 = (s)->System.out.println("B*4: "+s);
		
		b1.b("재정의 필요");
		b2.b("함수가 하나라서, 함수 명 삭제");
		b3.b("인자 삭제");
		b4.b("괄호 삭제");
	}
}

interface A{
	default void a(String s) {System.out.println("A  : "+s);}
}

interface B{
	void b(String s);
}
