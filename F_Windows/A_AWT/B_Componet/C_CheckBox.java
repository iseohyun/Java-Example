package B_Componet;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class C_CheckBox extends Frame implements ItemListener{
	Checkbox c1, c2, c3, r1, r2;
	CheckboxGroup g1;

	public C_CheckBox() {
		c1 = new Checkbox("딸기");
		c2 = new Checkbox("사과");
		c3 = new Checkbox("배");
		g1 = new CheckboxGroup();
		r1 = new Checkbox("남성", g1, true);
		r2 = new Checkbox("여성", g1, false);
		
		setLayout(new FlowLayout());
		add(c1);
		add(c2);
		add(c3);
		add(r1);
		add(r2);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		r1.addItemListener(this);
		r2.addItemListener(this);
		addWindowListener(new WindowExit(this));
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Checkbox cb = (Checkbox)e.getSource();
		if(cb.getState()) {
			System.out.println(e.getItem()+"이(가) 선택됨");
		}else {
			System.out.println(e.getItem()+"이(가) 해제됨");
		}
	}
	
	public static void main(String[] args) {
		C_CheckBox il = new C_CheckBox();
		il.setSize(300, 400);
		il.setVisible(true);
	}
}
