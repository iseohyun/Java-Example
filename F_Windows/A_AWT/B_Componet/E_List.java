package B_Componet;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class E_List extends Frame implements ItemListener{
	private List list1, list2;
	
	E_List() {
		list1 = new List(5, true);
		list2 = new List(3);
		
		list1.add("���");
		list1.add("��");
		list1.add("����");
		list1.add("��");
		list1.add("����");
		
		list2.add("¥���");
		list2.add("���");
		list2.add("���");
		list2.add("������");
		list2.add("«¥��");
		
		setLayout(new FlowLayout());
		add(list1);
		add(list2);
		
		list1.addItemListener(this);
		list2.addItemListener(this);
		addWindowListener(new WindowExit(this));
		
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new E_List();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource().equals(list1)) {
			String[] items = list1.getSelectedItems();
			System.out.print("�ߺ� ����Ʈ" + e.getItem() + ((e.getStateChange()==1)?"(����)":"(����)") + " : ");
			for(String item: items) {
				System.out.print(item + ", ");
			}
			System.out.println();
		}else {
			System.out.println("����Ʈ �Ϲ� (" + e.getItem() + ") : " + list2.getSelectedItem());
		}
	}
}
