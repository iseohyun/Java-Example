package Answer;

class Dog extends Animal implements runable{
	Dog(String name, String voice) {
		super(name);
		setVoice(voice);
	}

	@Override
	public void stop() {
		System.out.println(getName() + "�� �����մϴ�.");
	}
	
	public void crying() {
		System.out.println(getName() + "�� " + getVoice() + "�ϰ� ¢���ϴ�.");
	}
}

class Birds extends Animal implements flyable, runable{
	protected Birds(String name, String voice) {
		super(name);
		setVoice(voice);
	}

	@Override
	public void stop() {
		System.out.println(getName() + "�� �����մϴ�.");
	}
}

interface flyable {
	default void flying (String name) {
		System.out.println(name + "�� ���ư��ϴ�.");
	}
	default void landing(String name) {
		System.out.println(name + "�� �����մϴ�.");
	}
}

interface runable {
	default void running(String name) {
		System.out.println(name + "�� �޸��ϴ�.");
	}
	
	abstract void stop();
	
	static void sprint(String name) {
		System.out.println(name + "�� �������ָ� �մϴ�.");
	}
}

public class Test02 {
	public static void main(String[] args) {
		// TODO : ���⿡ �ڵ带 �Է��ϼ���.
		Dog booldog = new Dog("�ҵ�", "����");
		booldog.crying();
		booldog.running(booldog.getName());
		booldog.stop();
		
		Birds chicken = new Birds("��", "������");
		chicken.flying(chicken.getName());
		chicken.landing(chicken.getName());
		chicken.running(chicken.getName());
		chicken.stop();
		
		runable.sprint("ǥ��");
	}
}