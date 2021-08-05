package B_Event;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class F_ItemListener extends Frame implements ItemListener{
	Panel p;
	Checkbox c1, c2, c3, r1, r2;
	CheckboxGroup g1;
	TextArea area;

	public F_ItemListener() {
		addWindowListener(new WindowExit(this));
		p = new Panel();
		c1 = new Checkbox("����");
		c2 = new Checkbox("���");
		c3 = new Checkbox("��");
		g1 = new CheckboxGroup();
		r1 = new Checkbox("����", g1, true);
		r2 = new Checkbox("����", g1, false);
		area = new TextArea();
		
		p.add(c1);
		p.add(c2);
		p.add(c3);
		p.add(r1);
		p.add(r2);
		
		add("North", p);
		add("Center", area);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		r1.addItemListener(this);
		r2.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		Checkbox cb = (Checkbox)e.getSource();
		if(cb.getState()) {
			area.setText(e.getItem()+"��(��) ���õ�\n" + area.getText());
		}else {
			area.setText(e.getItem()+"��(��) ������\n" + area.getText());
		}
		
	}
	
	public static void main(String[] args) {
		F_ItemListener il = new F_ItemListener();
		il.setSize(300, 400);
		il.setVisible(true);
	}
}
