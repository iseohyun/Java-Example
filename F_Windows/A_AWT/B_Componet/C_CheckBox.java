package B_Componet;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class C_CheckBox extends Frame implements ItemListener {
	private static final long serialVersionUID = 1L;
	Checkbox c1 = new Checkbox("����");
	Checkbox c2 = new Checkbox("���");
	Checkbox c3 = new Checkbox("��");
	CheckboxGroup g1 = new CheckboxGroup();
	Checkbox r1 = new Checkbox("����", g1, true);
	Checkbox r2 = new Checkbox("����", g1, false);

	public C_CheckBox() {
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

		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new C_CheckBox();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Checkbox cb = (Checkbox) e.getSource();
		if (cb.getState()) {
			System.out.println(e.getItem() + "��(��) ���õ�");
		} else {
			System.out.println(e.getItem() + "��(��) ������");
		}
	}
}