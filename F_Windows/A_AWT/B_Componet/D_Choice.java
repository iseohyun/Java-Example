package B_Componet;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class D_Choice extends Frame implements ItemListener {
	private static final long serialVersionUID = 1L;
	private Choice c = new Choice();

	D_Choice() {
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
		System.out.println(e.getItem());
	}
}