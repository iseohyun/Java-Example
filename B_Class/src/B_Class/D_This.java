package B_Class;

class ClassThis{
	int num = 10;
	void fun1(int num) {
		num = num;
	}
	void fun2(int num) {
		this.num = num;
	}
}

public class D_This {
	public static void main(String[] args) {
		ClassThis ct = new ClassThis();
		ct.fun1(20);
		System.out.println("현재 값 : " + ct.num);

		ct.fun2(30);
		System.out.println("현재 값 : " + ct.num);
	}
}
