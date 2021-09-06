package Decorator;

/**
 * ��ó : https://ko.wikipedia.org/wiki/%EB%8D%B0%EC%BD%94%EB%A0%88%EC%9D%B4%ED%84%B0_%ED%8C%A8%ED%84%B4
 * 
 * @author Seohyun Jung
 *
 *		���ڷ���Ʈ ���� : ���α׷��� ����� ����ؼ� �߰��ȴٰ� �ϸ�, �߰��Ǵ� ����� �������� ������ ���� �� ���̰�,
 *			������� ������ ��������� ������, ������ �ּ�ȭ�ϱ� ���� ������ ���
 *
 *		�ڵ��ؼ�)
 *			Window <- ������
 *				   <- ������ũ�ѱ��
 *				   <- ����ũ�ѱ��
 */
public class Client {
	public static void main(String[] args) {
		Window decoratedWindow = new SimpleWindow();
		System.out.println(decoratedWindow.getDescription());
		
		decoratedWindow = new HScrollBar(new SimpleWindow());
		System.out.println(decoratedWindow.getDescription());
		
		decoratedWindow = new VScrollBar(new SimpleWindow());
		System.out.println(decoratedWindow.getDescription());
		
		decoratedWindow = new HScrollBar (new VScrollBar(new SimpleWindow()));
		System.out.println(decoratedWindow.getDescription());
	}
}

interface Window {
	public void draw();
	public String getDescription();
}

class SimpleWindow implements Window {
	public void draw() {}
	public String getDescription() {
		return "simple window";
	}
}

abstract class WindowDecorator implements Window {
	protected Window decoratedWindow;
	public WindowDecorator (Window decoratedWindow) {
		this.decoratedWindow = decoratedWindow;
	}
}

class VScrollBar extends WindowDecorator {
	public VScrollBar(Window decoratedWindow) {
		super(decoratedWindow);
	}

	@Override
	public void draw() {
		drawVerticalScrollBar();
		decoratedWindow.draw();
	}

	@Override
	public String getDescription() {
		return decoratedWindow.getDescription() + " + vertical scroll";
	}
	
	private void drawVerticalScrollBar() {}
}

class HScrollBar extends WindowDecorator {
	public HScrollBar (Window decoratedWindow) {
		super(decoratedWindow);
	}
	
	@Override
	public void draw() {
		drawHorizontalScrollBar();
		decoratedWindow.draw();
	}
	
	@Override
	public String getDescription() {
		return decoratedWindow.getDescription() + " + horizontal scroll";
	}
	
	private void drawHorizontalScrollBar() {}
}