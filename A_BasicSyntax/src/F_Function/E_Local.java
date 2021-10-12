package F_Function;

/**
 * 
 * 변수는 함수 안에서 또는 함수 밖에서 호출 될 수 있습니다.
 * 안에서 선언되는 변수를 전역변수, 밖에서 호출되는 변수를 지역변수라고 합니다.
 * (전역변수는 전체가 모두 쓸 수 있는 변수를 의미합니다. 괄호 가장 바깥쪽에 있는 변수를 의미합니다.)
 * 전역변수와 지역변수는 우연히 이름이 같다고 할지라도 전혀 다른 물리적 공간을 차지하고 있기 때문에, 정보를 공유할 수 없습니다.
 * 
 * 아래 예제에서 val함수는 함수가 호출될 때 생성되고, 리턴할 때 삭제되기 때문에,
 * 심지어는 첫 번째 호출된 val과  번째 호출된 val이 다른 것입니다.
 * 
 *  예제에서 무려 5번이나 호출되었지만, 모두 다른 val이기 때문에 모두 2가 출력되는 것입니다.
 *
 */

public class E_Local {
	public static void main(String[] args) {
		func1();
		func1();
		func1();
		func1();
		func1();
	}

	static void func1() {
		int val = 1;
		val++;
		System.out.println("로컬 변수 : " + val);
	}
}