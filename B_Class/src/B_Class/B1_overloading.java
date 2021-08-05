package B_Class;

public class B1_overloading {
	static class Class1 {
		Class1()		{ System.out.println("전달사항 없음");	}
		Class1(int i)	{ System.out.println("숫자 : " + i);	}
		Class1(char c)	{ System.out.println("문자 : " + c);	}
	}
	
	public static void main(String[] args) {
		Class1 c1 = new Class1();
		Class1 c2 = new Class1(1);
		Class1 c3 = new Class1('A');
	}
}
