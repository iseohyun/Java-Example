package e_Enum;

/**
 * 
 * enum(열거체 문법)
 * 
 * 		enum 열거체명 { 이름1, 이름2, 이름3 ... }
 * 
 * 	열거체는 코드의 가독성을 높이기 위해 사용되는 문법입니다.
 * 코드에 "1번색을 출력합니다." 라고 하는 것보다. "빨간색을 출력합니다."로 작성하면, 코드를 유지 보수하는데 훨씬 유리합니다.
 *
 *	열거체 선언과 사용(.)은 암기해야하겠지만, 세부함수(valueOf, ordinal 등) 모두 외울 필요는 없습니다.
 *	이런 기능이 있다는 것만 알고 있다가 필요할 때, 찾아서 쓰면 됩니다.
 *
 */

public class A_Enum {
	enum Rainbow { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }
	
	public static void main(String[] args) {
		System.out.println(Rainbow.GREEN);
		System.out.println("==========");

        Rainbow red = Rainbow.valueOf("RED");
        System.out.println(red);
		System.out.println("==========");
		
        int idx = Rainbow.YELLOW.ordinal();
        System.out.println(idx);
		System.out.println("==========");
        
        String str = Rainbow.VIOLET.name();
        System.out.println(str);
	}
}
