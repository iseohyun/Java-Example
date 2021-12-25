package b_Component;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
class DialogTest extends Dialog implements ActionListener {
	public DialogTest(Frame arg0, String msg) {
		super(arg0, "�޽��� ��ȭ����", true);
		setLayout(new FlowLayout());
		
		Label lab = new Label(msg);
		Button b = new Button("����");

		add(lab);
		add(b);

		setBackground(Color.GRAY);

		b.addActionListener(this);

		setSize(200, 300);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
	}
}

@SuppressWarnings("serial")
public class G_Dialog extends Frame implements ActionListener {
	Button b1 = new Button("���̾�α� ����");
	TextField message = new TextField("���⿡ �޽����� �Է��ϼ���.");

	public G_Dialog() {
		setLayout(new FlowLayout());

		add(message);
		add(b1);

		b1.addActionListener(this);

		addWindowListener(new WindowExit(this));

		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new G_Dialog();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new DialogTest(this, message.getText());
	}
}

// �ǽ����� : ���̾�α׸� �ϳ� �� ���������.
// �ǽ����� : red��� �Է��ϸ�, ����� �������� ���̾�αװ� �����ǵ��� ��������.
// �ǽ����� : ���̾�αװ� ������(ȣ��Ǹ�) �޽��� ���� (1)�̶� ���ڰ� ��µǵ��� �ϼ���. (��: "���⿡ �޽����� �Է��ϼ���.(1)")
//			���� �ι�° ȣ��Ǹ� (2)��� ���ڰ� ��µǵ��� �ϼ���. (��: "���⿡ �޽����� �Է��ϼ���.(2)")
//			ȣ��� ������ ���ڴ� �����մϴ�. (��: "���⿡ �޽����� �Է��ϼ���.(3)")