package B_Componet;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class I_Menu extends Frame implements ActionListener{
	private MenuBar bar;
	private Menu menu1, menu2, menu3, sub1_2;
	private MenuItem sub1_1, sub1_3;
	private MenuItem sub1_2_1, sub1_2_2;
	private MenuItem sub2_1, sub2_2;
	private MenuItem help;
	private TextArea ta;
	
	public I_Menu() {
		bar = new MenuBar();
		ta = new TextArea();
		menu1 = new Menu("����");
		menu2 = new Menu("����");
		menu3 = new Menu("����");
		sub1_1 = new MenuItem("����");
		sub1_2 = new Menu("�߰�");
		sub1_2_1 = new MenuItem("�ڹټ���");
		sub1_2_2 = new MenuItem("C����");
		sub1_3 = new MenuItem("����");
		sub2_1 = new MenuItem("�����");
		sub2_2 = new MenuItem("�����");
		help = new MenuItem("����");
		
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

		setMenuBar(bar);
		add("Center", ta);
 
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
		if(e.getSource().equals(sub1_1)) {
			ta.setText("���� ����\n" + ta.getText());
		}else if(e.getSource().equals(sub1_2_1)) {
			ta.setText("�ڹ� ����\n" + ta.getText());
		}else if(e.getSource().equals(sub1_2_2)) {
			ta.setText("C ����\n" + ta.getText());
		}else if(e.getSource().equals(sub1_3)) {
			dispose();
		}else if(e.getSource().equals(sub2_1)) {
			ta.setText("");
		}else if(e.getSource().equals(sub2_2)) {
			if(sub2_2.getLabel().equals("�����")) {
				ta.setVisible(false);
				sub2_2.setLabel("���̱�");
			}else {
				ta.setVisible(true);
				sub2_2.setLabel("�����");
			}
		}else if(e.getSource().equals(help)) {
			ta.setText("** �޴� ���� **\n" + ta.getText());
		}
	}
}
