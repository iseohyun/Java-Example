package Example;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class A_TrafficLight extends Frame implements ItemListener{
	private static final long serialVersionUID = 1L;
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();	
	Checkbox chkRed = new Checkbox("빨강");
	Checkbox chkYellow = new Checkbox("노랑");
	Checkbox chkLeft = new Checkbox("좌회전");
	Checkbox chkGreen = new Checkbox("초록");
	
	CheckboxGroup g1 = new CheckboxGroup();
	Checkbox rdoThree = new Checkbox("3등식", g1, false);
	Checkbox rdoFour = new Checkbox("4등식", g1, true);
	
	Label Red = new Label("����");
	Label Yellow = new Label("���");
	Label Left = new Label("");
	Label Green = new Label("�ʷ�");
	
	public A_TrafficLight() {
		p1.add(rdoThree);
		p1.add(rdoFour);
		
		p2.add(chkRed);
		p2.add(chkGreen);
		p2.add(chkLeft);
		p2.add(chkYellow);

		p3.setLayout(new GridLayout(1,4));
		Red.setBackground(Color.LIGHT_GRAY);
		Left.setBackground(Color.LIGHT_GRAY);
		p3.add(Red);
		p3.add(Green);
		p3.add(Left);
		p3.add(Yellow);
		
		add("North", p1);
		add("West", p2);
		add("South", p3);
		
		chkRed.addItemListener(this);
		chkYellow.addItemListener(this);
		chkGreen.addItemListener(this);
		chkLeft.addItemListener(this);
		
		rdoFour.addItemListener(this);
		rdoThree.addItemListener(this);
		
		addWindowListener(new WindowExit(this));
		
		pack();
		setVisible(true);
	}
	
	void rdoThree() {
		if(rdoThree.getState()) {
			Left.setEnabled(true);
		}else {
		}
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(chkRed.getState()) {
			Red.setBackground(Color.RED);
		}else {
			Red.setBackground(Color.LIGHT_GRAY);
		}
		if(chkYellow.getState()) {
			Yellow.setBackground(Color.YELLOW);
		}else {
			Yellow.setBackground(null);
		}
		if(chkGreen.getState()) {
			Green.setBackground(Color.GREEN);
		}else {
			Green.setBackground(null);
		}
		if(chkLeft.getState() && rdoFour.getState()) {
			Left.setText("<-");
			Left.setBackground(Color.PINK);
		}else {
			rdoThree();
			Left.setText("");
			Left.setBackground(Color.LIGHT_GRAY);
		}
	}
	public static void main(String[] args) {
		new A_TrafficLight();
	}
}

class WindowExit extends WindowAdapter{
	private Frame f;
	
	WindowExit(Frame f){
		this.f = f;
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}
}