package Answer;

class Dog extends Animal implements runable{
	Dog(String name, String voice) {
		super(name);
		setVoice(voice);
	}

	@Override
	public void stop() {
		System.out.println(getName() + "이 정지합니다.");
	}
	
	public void crying() {
		System.out.println(getName() + "이 " + getVoice() + "하고 짖습니다.");
	}
}

class Birds extends Animal implements flyable, runable{
	protected Birds(String name, String voice) {
		super(name);
		setVoice(voice);
	}

	@Override
	public void stop() {
		System.out.println(getName() + "이 정지합니다.");
	}
}

interface flyable {
	default void flying (String name) {
		System.out.println(name + "이 날아갑니다.");
	}
	default void landing(String name) {
		System.out.println(name + "이 착지합니다.");
	}
}

interface runable {
	default void running(String name) {
		System.out.println(name + "이 달립니다.");
	}
	
	abstract void stop();
	
	static void sprint(String name) {
		System.out.println(name + "이 전력질주를 합니다.");
	}
}

public class Test02 {
	public static void main(String[] args) {
		// TODO : 여기에 코드를 입력하세요.
		Dog booldog = new Dog("불독", "컹컹");
		booldog.crying();
		booldog.running(booldog.getName());
		booldog.stop();
		
		Birds chicken = new Birds("닭", "꼬끼오");
		chicken.flying(chicken.getName());
		chicken.landing(chicken.getName());
		chicken.running(chicken.getName());
		chicken.stop();
		
		runable.sprint("표범");
	}
}