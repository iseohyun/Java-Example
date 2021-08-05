package C_Event;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class F2_List extends Frame implements ItemListener, ActionListener{
	private Panel p;
	private Button btn;
	private Choice choi;
	private List lst;
	private TextArea ta;
	private String[] item = {"서울", "인천", "부산", "광주", "대전", "대구", "울산"};
	
	F2_List() {
		addWindowListener(new WindowExit(this));
		
		p = new Panel();
		btn = new Button("선택");
		choi = new Choice();
		lst = new List();
		ta = new TextArea();
		
		p.add(choi);
		p.add(lst);
		p.add(btn);
		
		add("North",p);
		add("Center", ta);
		
		for(String item : item) {
			choi.add(item);
			lst.add(item);
		}
		
		choi.addItemListener(this);
		lst.setMultipleMode(true);
		btn.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		ta.setText("");
		String[] items = lst.getSelectedItems();
		for(String item: items) {
			ta.setText(ta.getText() +item+ "선택됨\n");
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		ta.setText(choi.getSelectedItem() + "선택됨\n");
	}
	
	public static void main(String [] args) {
		F2_List list = new F2_List();
		list.setSize(300, 400);
		list.setVisible(true);
	}
}
