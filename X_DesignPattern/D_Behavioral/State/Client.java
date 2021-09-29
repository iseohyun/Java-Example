package State;
/**
 * 출처 : https://ko.wikipedia.org/w/index.php?title=%EC%83%81%ED%83%9C_%ED%8C%A8%ED%84%B4
 * 
 * @author Seohyun Jung
 *	
 *		상태 패턴 : 같은 명령으로(예제에서, writeName) 서로 다른 기능을 구현해야 할 때 사용하는 패턴
 *			상태가 추가 될 때, 상위 객체를 수정할 필요없이, 자신의 기능과 추가할 수 있다.
 *			전략 패턴과 차이가 있다면, 상위 객체에 상태에 관한 인터페이스를 초기에 구현해두어야 한다는 것이다.
 *	
 *		예제 설명 :
 *			StateContext ← myState
 *				State1		  ↑
 *				State2	──────┘ 
 *				State3
 *
 */

public class Client {
	public static void main(String[] args) {
		final StateContext sc = new StateContext();
		sc.writeName("Monday");
		sc.writeName("Tuesday");
		sc.writeName("Wednesday");
		sc.writeName("Thursday");
		sc.writeName("Friday");
		sc.writeName("Saturday");
		sc.writeName("Sunday");
	}
}

class StateContext {
	private StateIf myState = new State1();

	void setState(final StateIf newState) {
		myState = newState;
	}

	public void writeName(final String name) {
		myState.Action(this, name);
	}
}

interface StateIf {
	void Action(StateContext context, String name);
}

class State1 implements StateIf {
	@Override
	public void Action(final StateContext context, final String name) {
		System.out.println("소문자 출력 : " + name.toLowerCase());
		context.setState(new State2());
	}
}

class State2 implements StateIf {
	@Override
	public void Action(final StateContext context, final String name) {
		System.out.println("대문자 출력 : " + name.toUpperCase());
		context.setState(new State3());
	}
}

class State3 implements StateIf {
	@Override
	public void Action(StateContext context, String name) {
		System.out.println("그대로 출력 : " + name);
		context.setState(new State1());
	}
}