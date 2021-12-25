package b_Component;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class C_CheckBox extends Frame implements ItemListener {
	Checkbox c1 = new Checkbox("딸기");
	Checkbox c2 = new Checkbox("사과");
	Checkbox c3 = new Checkbox("배");
	CheckboxGroup g1 = new CheckboxGroup();
	Checkbox r1 = new Checkbox("남성", g1, true);
	Checkbox r2 = new Checkbox("여성", g1, false);

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
			System.out.println(e.getItem() + "이(가) 선택됨");
		} else {
			System.out.println(e.getItem() + "이(가) 해제됨");
		}
	}
}

// 실습과제 : 새로운 체크박스를 추가합니다. 추가한 체크박스는 "귤"입니다.
// 실습과제 : 새로운 라디오 박스를 추가합니다. 추가한 라디오 박스는 "중성"입니다.
// 실습과제 : 새로운 라디오 박스 그룹을 추가합니다. 추가한 그룹은 "가위", "바위", "보"를 갖습니다.