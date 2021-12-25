package b_Component;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class I_Menu extends Frame implements ActionListener {
	MenuBar bar = new MenuBar();
	TextArea ta = new TextArea();
	Menu menu1 = new Menu("����");
	Menu menu2 = new Menu("����");
	Menu menu3 = new Menu("����");
	MenuItem sub1_1 = new MenuItem("����");
	Menu sub1_2 = new Menu("�߰�");
	MenuItem sub1_2_1 = new MenuItem("�ڹټ���");
	MenuItem sub1_2_2 = new MenuItem("C����");
	MenuItem sub1_3 = new MenuItem("����");
	MenuItem sub2_1 = new MenuItem("�����");
	MenuItem sub2_2 = new MenuItem("�����");
	MenuItem help = new MenuItem("����");

	public I_Menu() {
		setMenuBar(bar);
		add("Center", ta);

		bar.add(menu1);
		bar.add(menu2);
		bar.add(menu3);
		menu1.add(sub1_1);
		menu1.add(sub1_2);
		sub1_2.add(sub1_2_1);
		sub1_2.add(sub1_2_2);
		menu1.addSeparator();
		menu1.add(sub1_3);
		menu2.add(sub2_1);
		menu2.add(sub2_2);
		menu3.add(help);

		sub1_1.addActionListener(this);
		sub1_2_1.addActionListener(this);
		sub1_2_2.addActionListener(this);
		sub1_3.addActionListener(this);
		sub2_1.addActionListener(this);
		sub2_2.addActionListener(this);
		help.addActionListener(this);
		addWindowListener(new WindowExit(this));

		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new I_Menu();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(sub1_1)) {
			ta.setText("���� ����\n" + ta.getText());
		} else if (e.getSource().equals(sub1_2_1)) {
			ta.setText("�ڹ� ����\n" + ta.getText());
		} else if (e.getSource().equals(sub1_2_2)) {
			ta.setText("C ����\n" + ta.getText());
		} else if (e.getSource().equals(sub1_3)) {
			dispose();
		} else if (e.getSource().equals(sub2_1)) {
			ta.setText("");
		} else if (e.getSource().equals(sub2_2)) {
			if (sub2_2.getLabel().equals("�����")) {
				ta.setVisible(false);
				sub2_2.setLabel("���̱�");
			} else {
				ta.setVisible(true);
				sub2_2.setLabel("�����");
			}
		} else if (e.getSource().equals(help)) {
			ta.setText("** �޴� ���� **\n" + ta.getText());
		}
	}
}

// �ǽ����� : ���� ���⸦ Ŭ���ϸ�, ���� ���� ���̾�αװ� �������� �����Ͻÿ�.
//		���� ���̾�α׷� ������ ����, �Ʒ� �ؽ�Ʈ ���ڿ� �ؽ�Ʈ�� ������ �� �ֵ��� �����Ͻÿ�.
// �ǽ����� : ���Ͽ� ���� �޴��� �߰��ϰ�, ����޴� �Ʒ� ���ܼ��� �߰��Ͽ� �߰��� ��輱�� ����ÿ�.
//		����޴��� ���� ���̾�αװ� ������, �������� �ؽ�Ʈ�� ����Ǵ� ����Դϴ�.
// �ǽ����� : ������ Ŭ���Ǹ�, ������ ������ ����� �߰��� ���ϴ�.