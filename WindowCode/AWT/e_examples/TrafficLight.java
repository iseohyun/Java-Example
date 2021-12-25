package e_examples;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class TrafficLight extends Frame implements ItemListener{
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();	
	
	Checkbox chkRed = new Checkbox("빨강");
	Checkbox chkYellow = new Checkbox("노랑");
	Checkbox chkLeft = new Checkbox("좌회전");
	Checkbox chkGreen = new Checkbox("초록");
	
	Label lab1 = new Label("좌회전 신호가 있나요?");
	CheckboxGroup g1 = new CheckboxGroup();
	Checkbox rdoThree = new Checkbox("없어요", g1, false);
	Checkbox rdoFour = new Checkbox("있어요", g1, true);
	
	Label Red = new Label();
	Label Yellow = new Label();
	Label Left = new Label();
	Label Green = new Label();
	
	public TrafficLight() {
		setLayout(new GridLayout(3,1));
		add(p1);
		add(p2);
		add(p3);

		p1.add(lab1);
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
		if(e.getSource().equals(rdoFour)) {
			chkLeft.setVisible(true);
		}else if(e.getSource().equals(rdoThree)) {
			chkLeft.setVisible(false);
			Left.setBackground(Color.LIGHT_GRAY);
		}
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
		new TrafficLight();
	}
}

// 빨간불이 들어오면, 파란불과 좌회전 신호가 모두 꺼지도록 기능을 추가해 봅니다.