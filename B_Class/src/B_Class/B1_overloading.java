package B_Class;

public class B1_overloading {
	static class Class1 {
		Class1()		{ System.out.println("���޻��� ����");	}
		Class1(int i)	{ System.out.println("���� : " + i);	}
		Class1(char c)	{ System.out.println("���� : " + c);	}
	}
	
	public static void main(String[] args) {
		Class1 c1 = new Class1();
		Class1 c2 = new Class1(1);
		Class1 c3 = new Class1('A');
	}
}
