package Factory;

/**
 *	��ó : https://ko.wikipedia.org/wiki/�߻�_���丮_���� 
 * 
 * @author Seohyun Jung
 *
 *		�߻� ���丮 ���� : ������ ��ü�� ������ Ư¡�� �ִٰ� ���� �� ��,
 *			�������̽���(�߻�޼���) ����ȭ�� �־ ���������� ����ȭ(����ȭ)��Ų��.
 *
 *	  �ڵ� (����ȭ ����):
 *		GUIŸ��	-->	IGUIFactory	-->	IButton
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