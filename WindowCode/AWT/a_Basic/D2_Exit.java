package a_Basic;

import java.awt.Frame;

// �ռ� �������� WindowListener�� ��ӹ������� ���ؼ� ���ʿ��� �޼��尡 �ݵ�� ������ �Ǿ�� �ϴ� �������� ���ҽ��ϴ�.
// WindowAdapter�� �̿��Ͽ�, ���ʿ��� �ڵ带 ���� �� �ֽ��ϴ�.

@SuppressWarnings("serial")
public class D2_Exit extends Frame {
	public D2_Exit() {
		addWindowListener(new WindowExit(this));

		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new D2_Exit();
	}
}