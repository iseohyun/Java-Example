package b_Component;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class B_Button extends Frame implements ActionListener {
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Button a1 = new Button("�г� 2 ���̱�");
	Button a2 = new Button("�г� 2 �Ⱥ��̱�");
	Button b1 = new Button("�г� 1 ���߱�");

	B_Button() {
		setLayout(new FlowLayout());
		
		p1.setBackground(Color.BLUE);
		add(p1);
		
		p2.setBackground(Color.MAGENTA);
		add(p2);

		p1.add(a1);
		p1.add(a2);
		p2.add(b1);

		a1.addActionListener(this);
		a2.addActionListener(this);
		b1.addActionListener(this);

		addWindowListener(new WindowExit(this));

		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new B_Button();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(a1)) {
			p2.setVisible(true);
			a1.setEnabled(false);
			a2.setEnabled(true);
		} else if (e.getSource().equals(a2)) {
			p2.setVisible(false);
			a2.setEnabled(false);
			a1.setEnabled(true);
		} else if (e.getSource().equals(b1)) {
			if(p1.isVisible()) {
				System.out.println("1");
				p1.setVisible(false);
				b1.setLabel("�г�1 ���̱�");
			}else {
				System.out.println("2");
				p1.setVisible(true);
				b1.setLabel("�г�1 ���߱�");
			}
		}
	}
}

// �ǽ����� : �г��� �߰� �����ϰ� �̸��� "�г� 1,2 ���̱�", "�г� 1,2 �Ⱥ��̱�"�� �մϴ�.
//			�ش� ����� �����մϴ�.