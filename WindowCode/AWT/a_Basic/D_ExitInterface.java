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
		System.out.println("�����찡 �����մϴ�.");
	}

	@Override
	// �� ������ �ٽ��Դϴ�. WindowListener�� ��ӹ����� �ش� �������̽��� ������ �ִ� �޼������ �ݵ�� ������ �ؾ��մϴ�.
	// ������ ���� �Լ� ��, �����찡 ���� ��
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		dispose();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�����찡 �������ϴ�.");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�����찡 �ּ�ȭ�˴ϴ�.");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�����찡 ���� �Ǿ����ϴ�.");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�����찡 ���� �Ǿ����ϴ�.");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�����찡 �������� �Ǿ����ϴ�.");
	}
}

// �ǽ����� : ���� ������ �޽����� ��µǴ��� Ȯ���� ���ô�.
// �ǽ����� : dispose();�޼��尡 Closed�� �߰��Ǿ��� �� �������� �ʴ� ������ ���ؼ� �����غ��ô�.
// �ǽ�����(�����) : �����찡 �ּ�ȭ �� ��, "�����찡 �������� �Ǿ����ϴ�." �޽����� ��µ��� �ʵ��� ������ ���ϴ�. 