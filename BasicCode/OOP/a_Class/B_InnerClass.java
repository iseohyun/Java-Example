package a_Class;

class ClassA {
	class ClassB {
		class ClassC {}
		ClassC c = new ClassC();
	}
	ClassB b = new ClassB();
}

public class B_InnerClass {
	public static void main(String[] args) {
		ClassA a = new ClassA();
		System.out.println(a.b.c);
	}
}


// �ǽ����� 1: B_InnerClass �ȿ��� Ŭ���� X�� �����ϰ� ȣ���� ���ϴ�.
// �ǽ����� 2: class X�ȿ� Y�� �����ϰ� ȣ���غ��ϴ�.
