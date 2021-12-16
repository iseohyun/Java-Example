package b_Extends;

/**
 * 
 * 	같은 필드명을 갖는 경우
 * 
 * 예제에서는 부모와 자식에서 같은 str을 사용하고 있습니다.
 * 결과값은 누가 호출했는지에 따라 달라집니다.
 *
 */

public class B_Overriding {
	static class Parent {
		String str = "Parent";
	}

	static class Child extends Parent {
		String str = "Child";
	}

	public static void main(String[] args) {
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		System.out.println(p1.str);
		System.out.println(c1.str);
	}
}

// 실습과제 : String str = "Child"; 대신 String str;를 입력하고 실행해보세요.