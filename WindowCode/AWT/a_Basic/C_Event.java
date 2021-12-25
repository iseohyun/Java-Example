package a_Basic;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class C_Event extends Frame implements ActionListener {
	private Button b = new Button("�����ּ���");

	C_Event() {
		add(b);

		// 1. Event�� ��ǻ�Ͱ� ������ �ϰ� �Ǵ� ��� ��Ⱑ �Ǵ� ������ ���մϴ�.
		//   ����ڰ� Ű���带 �����ų�, ������ Ű���忡�� ���� ���ų�, ���콺�� �����̰ų�, Ŭ���� �ϰų� ��� ����
		//	 Ư���� �ð��� �����ų�, Ư���� ���α׷��� ����Ǿ��ų�, �������� ������ ������ ���°ų�, ���� �� ��ǻ�Ϳ� ������ �߰ų�,
		//	 ��ǻ�Ͱ� ������ �� �ִ� ��� ������ ��� �̺�Ʈ�� �� �� �ֽ��ϴ�.
		//	 Event�� �����ϴ� ���� Listen�̶�� �մϴ�.
		b.addActionListener(this);

		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new C_Event();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("��ư�� ����");
	}
}

// �ǽ����� : ��ư�� �ϳ� �� �����, �ش� ��ư�� ������ ����, ��ư�� �����̶�� �޽����� ��µǵ��� �ٲپ� ���ϴ�.