package B_Component;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

class CheckboxTest extends Frame{
	private Checkbox c1, c2, c3;
	private Checkbox r1_1, r1_2, r1_3;
	private Checkbox r2_1, r2_2, r2_3;
	CheckboxGroup gr1, gr2;
	
	CheckboxTest() {
		setLayout(new FlowLayout());
		c1 = new Checkbox("1번", true);
		c2 = new Checkbox("2번");
		c3 = new Checkbox("3번", true);
		
		gr1 = new CheckboxGroup();
		gr2 = new CheckboxGroup();
		
		r1_1 = new Checkbox("1번",true, gr1);
		r1_2 = new Checkbox("2번",false, gr1);
		r1_3 = new Checkbox("3번",false, gr1);

		r2_1 = new Checkbox("4번",true, gr2);
		r2_2 = new Checkbox("5번",false, gr2);
		r2_3 = new Checkbox("6번",false, gr2);

		add(c1);
		add(c2);
		add(c3);
		
		add(r1_1);
		add(r1_2);
		add(r1_3);
		
		add(r2_1);
		add(r2_2);
		add(r2_3);

		setBounds(300,400,800,600);
		setVisible(true);
	}	
}

public class B2_CheckBox {
	public static void main(String [] args) {
		CheckboxTest f = new CheckboxTest();	
	}
}
