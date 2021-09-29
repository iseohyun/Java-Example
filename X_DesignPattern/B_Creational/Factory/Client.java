package Factory;

/**
 *	출처 : https://ko.wikipedia.org/wiki/추상_팩토리_패턴 
 * 
 * @author Seohyun Jung
 *
 *		추상 팩토리 패턴 : 각각의 객체가 공통의 특징이 있다고 가정 할 때,
 *			인터페이스를(추상메서드) 구조화에 넣어서 생성과정을 구조화(패턴화)시킨다.
 *
 *	  코드 (구조화 과정):
 *		GUI타입	-->	IGUIFactory	-->	IButton
 *	  ----------------------------------------
 *		 Win	-->	WinFactory	-->	WinButton
 *		 iOS	-->	OSXFactory	-->	OSXButton
 *
 */

public class Client {
	static public void main(String[] args) {
		int OSStyle = 1;
		IGUIFactory factory = null;

		switch (OSStyle) {
		case 1:
			factory = new WinFactory();
			break;
		case 2:
			factory = new OSXFactory();
			break;
		}

		IButton button = factory.CreateButton();
		button.Paint();
	}
}

//	IGUIFactory
interface IGUIFactory {
	IButton CreateButton();
}

class WinFactory implements IGUIFactory {
	public IButton CreateButton() {
		return new WinButton();
	}
}

class OSXFactory implements IGUIFactory {
	public IButton CreateButton() {
		return new OSXButton();
	}
}

//	IButton
interface IButton {
	void Paint();
}

class WinButton implements IButton {
	public void Paint() {
		System.out.println("Render a button in a Windows style");
	}
}

class OSXButton implements IButton {
	public void Paint() {
		System.out.println("Render a button in a Mac OS X style");
	}
}