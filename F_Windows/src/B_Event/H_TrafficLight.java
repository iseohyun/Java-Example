package B_Event;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class H_TrafficLight extends Frame implements ItemListener{
	private Panel p1, p2, p3;
	private Checkbox rdoThree, rdoFour;
	private CheckboxGroup g1;
	private Checkbox chkRed, chkYellow, chkLeft, chkGreen;
	private Button btnRed, btnYellow, btnLeft, btnGreen;
	private TextArea ta;
	private boolean flag = true;
	
	public H_TrafficLight() {
		addWindowListener(new WindowExit(this));
		
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		
		chkRed = new Checkbox("»¡°­");
		chkYellow = new Checkbox("³ë¶û");
		chkLeft = new Checkbox("ÁÂÈ¸Àü");
		chkGreen = new Checkbox("ÃÊ·Ï");
		
		g1 = new CheckboxGroup();
		rdoThree = new Checkbox("3µî½Ä", g1, false);
		rdoFour = new Checkbox("4µî½Ä", g1, true);
		
		btnRed = new Button("»¡°­");
		btnYellow = new Button("³ë¶û");
		btnLeft = new Button("");
		btnGreen = new Button("ÃÊ·Ï");
		
		p1.add(rdoThree);
		p1.add(rdoFour);
		
		p2.add(chkRed);
		p2.add(chkGreen);
		p2.add(chkLeft);
		p2.add(chkYellow);

		p3.setLayout(new GridLayout(1,4));
		p3.add(btnRed);
		p3.add(btnGreen);
		p3.add(btnLeft);
		p3.add(btnYellow);
		
		add("North", p1);
		add("West", p2);
		add("South", p3);
		
		chkRed.addItemListener(this);
		chkYellow.addItemListener(this);
		chkGreen.addItemListener(this);
		chkLeft.addItemListener(this);
		
		rdoFour.addItemListener(this);
		rdoThree.addItemListener(this);
	}
	
	void rdoThree() {
		if(rdoThree.getState()) {
			btnLeft.setEnabled(true);
		}else {
		}
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(chkRed.getState()) {
			btnRed.setBackground(Color.RED);
		}else {
			btnRed.setBackground(null);
		}
		if(chkYellow.getState()) {
			btnYellow.setBackground(Color.YELLOW);
		}else {
			btnYellow.setBackground(null);
		}
		if(chkGreen.getState()) {
			btnGreen.setBackground(Color.GREEN);
		}else {
			btnGreen.setBackground(null);
		}
		if(chkLeft.getState() && rdoFour.getState()) {
			btnLeft.setLabel("<-");
			btnLeft.setBackground(Color.PINK);
		}else {
			rdoThree();
			btnLeft.setLabel("");
			btnLeft.setBackground(null);
		}
	}
	public static void main(String[] args) {
		H_TrafficLight tl = new H_TrafficLight();
		tl.setSize(300,400);
		tl.setVisible(true);
	}
}
