package b_Extends;

/**
 * 
 * 상속 : 클래스를 사용하는 핵심은 코드재사용이 너무 간편하다는 것입니다.
 * 코드 재사용은 어떻게 상속을 받는지가 중요합니다.
 * 
 * 일반적으로 상속을 해주는 주최를 부모클래스, 상속을 받는 클래스를 자식 클래스라고 하고,
 * 기호로 "자식 -> 부모"로 표기합니다.(일반화한다고 합니다.)
 *
 * 상속 문법을 암기해야합니다.
 * 
 * class 자식 extends 부모{
 * 	내용;
 * }
 * 
 * 상속의 특징은, 자식이 부모의 모든 기능을 사용 가능하다는 점입니다.
 * 
 */

public class A_Extends {
	static class Parent {
		String str = "Parent";
	}

	static class Child extends Parent {
		String str2 = "Child";
	}

	public static void main(String[] args) {
		Child c1 = new Child();

		System.out.println(c1.str);
		System.out.println(c1.str2);
	}
}