package B_Component;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;

class ListTest extends Frame{
	private List list1, list2;
	
	ListTest () {
		setLayout(new FlowLayout());
		list1 = new List(5, true);    //()���ڴ� ��µ� �������� �����Ѵ�. �⺻����Ʈ�� 4���̴�.
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
		
		add(list1);
		add(list2);
		
		setSize(300, 400);
		setVisible(true);
	}
}
public class B4_List {
	public static void main(String [] args) {
		ListTest f = new ListTest();
	}
}
