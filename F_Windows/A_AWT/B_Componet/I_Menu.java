package B_Componet;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class I_Menu extends Frame implements ActionListener{
	private static final long serialVersionUID = 1L;
	MenuBar bar = new MenuBar();
	TextArea ta = new TextArea();
	Menu menu1 = new Menu("파일");
	Menu menu2 = new Menu("편집");
	Menu menu3 = new Menu("도움말");
	MenuItem sub1_1 = new MenuItem("열기");
	Menu sub1_2 = new Menu("추가");
	MenuItem sub1_2_1 = new MenuItem("자바수업");
	MenuItem sub1_2_2 = new MenuItem("C수업");
	MenuItem sub1_3 = new MenuItem("종료");
	MenuItem sub2_1 = new MenuItem("지우기");
	MenuItem sub2_2 = new MenuItem("숨기기");
	MenuItem help = new MenuItem("도움말");

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
		if(e.getSource().equals(sub1_1)) {
			ta.setText("파일 열기\n" + ta.getText());
		}else if(e.getSource().equals(sub1_2_1)) {
			ta.setText("자바 수업\n" + ta.getText());
		}else if(e.getSource().equals(sub1_2_2)) {
			ta.setText("C 수업\n" + ta.getText());
		}else if(e.getSource().equals(sub1_3)) {
			dispose();
		}else if(e.getSource().equals(sub2_1)) {
			ta.setText("");
		}else if(e.getSource().equals(sub2_2)) {
			if(sub2_2.getLabel().equals("숨기기")) {
				ta.setVisible(false);
				sub2_2.setLabel("보이기");
			}else {
				ta.setVisible(true);
				sub2_2.setLabel("숨기기");
			}
		}else if(e.getSource().equals(help)) {
			ta.setText("** 메뉴 예제 **\n" + ta.getText());
		}
	}
}
