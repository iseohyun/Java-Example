package B_Componet;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class D_Choice extends Frame implements ItemListener{
	private Choice c;
	D_Choice(){
		c = new Choice();
		c.add("ù��°");
		c.add("�ι�°");
		c.add("����°");
		c.add("�׹�°");

		add(c);
		c.addItemListener(this);
		addWindowListener(new WindowExit(this));
		
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new D_Choice();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getItem());
	}
}
