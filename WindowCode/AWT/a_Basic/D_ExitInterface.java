package a_Basic;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class D_ExitInterface extends Frame implements WindowListener {
	public D_ExitInterface() {
		addWindowListener(this);

		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new D_ExitInterface();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("윈도우가 시작합니다.");
	}

	@Override
	// 이 예제의 핵심입니다. WindowListener를 상속받으면 해당 인터페이스가 가지고 있는 메서드들을 반드시 재정의 해야합니다.
	// 재정의 받은 함수 중, 윈도우가 닫힐 때
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		dispose();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("윈도우가 닫혔습니다.");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("윈도우가 최소화됩니다.");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("윈도우가 복원 되었습니다.");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("윈도우가 선택 되었습니다.");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("윈도우가 선택해제 되었습니다.");
	}
}

// 실습과제 : 언제 각각의 메시지가 출력되는지 확인해 봅시다.
// 실습과제 : dispose();메서드가 Closed에 추가되었을 때 동작하지 않는 이유에 대해서 생각해봅시다.
// 실습과제(고급자) : 윈도우가 최소화 될 때, "윈도우가 선택해제 되었습니다." 메시지가 출력되지 않도록 수정해 봅니다. 