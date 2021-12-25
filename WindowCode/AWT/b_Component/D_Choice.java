package b_Component;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class D_Choice extends Frame implements ItemListener {
	boolean isFirst = true;
	Choice c = new Choice();

	D_Choice() {
		c.add("���ϴ� ���� �������ּ���.");
		c.add("������");
		c.add("��Ȳ��");
		c.add("�����");
		c.add("�ʷϻ�");
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
		if(e.getItem() == "������") {
			setBackground(Color.red);
		}else if(e.getItem() == "��Ȳ��") {
			setBackground(Color.orange);
		}else if(e.getItem() == "�����") {
			setBackground(Color.yellow);
		}else if(e.getItem() == "�ʷϻ�") {
			setBackground(Color.green);
		}
		
		if(isFirst) {
			c.remove(0);
			isFirst = false;
		}
	}
}

// �ǽ����� "�Ķ���"�� �߰��غ��ϴ�.
// �ǽ����� ���ʿ� "������"�� ������ ���ϴ�. 
