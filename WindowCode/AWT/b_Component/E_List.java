package b_Component;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class E_List extends Frame implements ItemListener {
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	
	Panel p2_1 = new Panel();
	Panel p2_2 = new Panel();
	
	List list1 = new List(3, true);
	List list2 = new List(5);
	List list3 = new List(10);

	E_List() {
		setLayout(new FlowLayout());

		add(p1);
		add(p2);
		p2.add(p2_1);
		p2.add(p2_2);
		
		p1.add(list1);
		p2_1.add(list2);
		p2_2.add(list3);

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
		if (e.getSource().equals(list1)) {
			String[] items = list1.getSelectedItems();
			System.out.print("�ߺ� ����Ʈ" + e.getItem() + ((e.getStateChange() == 1) ? "(����)" : "(����)") + " : ");
			for (String item : items) {
				System.out.print(item + ", ");
			}
			System.out.println();
		} else if (e.getSource().equals(list2)){
			System.out.println("����Ʈ �Ϲ� (" + e.getItem() + ") : " + list2.getSelectedItem());
			list3.add(list2.getSelectedItem());
		}
	}
}

// �ǽ����� : "��"�� �߰��� ���ϴ�.
// �ǽ����� : ����Ʈ 3���� ����Ʈ2(¥���, ���.. ) ���� ���õ� ����Ʈ�� ����ؼ� �߰��˴ϴ�.
//		   ������ �ֹ����� �����ϴ�. ����Ʈ�� �߰��Ϸ��� �� ��, �̹� �ش� �޴��� �ִٸ�, �ش� �޴��� ���ڸ� �߰��ϴ� ������� �����غ�����.
//			�� ) ¥��� -> ¥���2 -> ¥���3
//		   list3.getItemCount()
//		   list3.replaceItem()
// �ǽ����� : ����Ʈ 3���� �޴��� Ŭ���ϸ� �ϳ��� ����ϴ� ����� �߰��� �ּ���.