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
		
		list1.add("사과");
		list1.add("배");
		list1.add("포도");
		list1.add("귤");
		list1.add("레몬");
		
		list2.add("짜장면");
		list2.add("울면");
		list2.add("라면");
		list2.add("볶음면");
		list2.add("짬짜면");
		
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
			System.out.print("중복 리스트" + e.getItem() + ((e.getStateChange()==1)?"(선택)":"(해제)") + " : ");
			for(String item: items) {
				System.out.print(item + ", ");
			}
			System.out.println();
		}else {
			System.out.println("리스트 일반 (" + e.getItem() + ") : " + list2.getSelectedItem());
		}
	}
}
