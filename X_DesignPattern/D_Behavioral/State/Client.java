package State;
/**
 * ��ó : https://ko.wikipedia.org/w/index.php?title=%EC%83%81%ED%83%9C_%ED%8C%A8%ED%84%B4
 * 
 * @author Seohyun Jung
 *	
 *		���� ���� : ���� �������(��������, writeName) ���� �ٸ� ����� �����ؾ� �� �� ����ϴ� ����
 *			���°� �߰� �� ��, ���� ��ü�� ������ �ʿ����, �ڽ��� ��ɰ� �߰��� �� �ִ�.
 *			���� ���ϰ� ���̰� �ִٸ�, ���� ��ü�� ���¿� ���� �������̽��� �ʱ⿡ �����صξ�� �Ѵٴ� ���̴�.
 *	
 *		���� ���� :
 *			StateContext �� myState
 *				State1		  ��
 *				State2	�������������� 
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
		System.out.println("�ҹ��� ��� : " + name.toLowerCase());
		context.setState(new State2());
	}
}

class State2 implements StateIf {
	@Override
	public void Action(final StateContext context, final String name) {
		System.out.println("�빮�� ��� : " + name.toUpperCase());
		context.setState(new State3());
	}
}

class State3 implements StateIf {
	@Override
	public void Action(StateContext context, String name) {
		System.out.println("�״�� ��� : " + name);
		context.setState(new State1());
	}
}