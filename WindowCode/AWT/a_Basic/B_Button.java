package a_Basic;

import java.awt.Button;
import java.awt.Frame;

@SuppressWarnings("serial")
public class B_Button extends Frame {
	// ButtonŬ������ ��ư�� �����ϴ� Ŭ���� �Դϴ�.
	Button b = new Button("�ȳ�?");

	B_Button() {
		// ������ �ν��Ͻ��� �߰��� �־�� �մϴ�. add�� Frame�� ���� �޼��� �Դϴ�.
		add(b);

		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new B_Button();
	}
}

// �ǽ����� : ��ư�� �߰��� ���ϴ�. �߰��� ��ư�� "��, �ȳ�!" �� �Է��� �ݴϴ�.
// �ǽ����� : ��ư�� ������ �ʳ���? Layout(���̾ƿ�; ��ġ)�����Դϴ�.
//			�Ʒ� �ڵ带 �����ڿ� �߰��� �ݴϴ�.
//			setLayout(new FlowLayout());