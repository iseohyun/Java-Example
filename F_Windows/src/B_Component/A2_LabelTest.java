package B_Component;

import java.awt.Frame;
import java.awt.Label;


class LabelTest01 extends Frame{
	private Label lab1;
	LabelTest01(){
		lab1 = new Label("첫번째 라벨");
		
		add(lab1);
		setSize(300, 400);
		setVisible(true);
	}
	
}

public class A2_LabelTest {
	public static void main(String [] args) {
		LabelTest01 f = new LabelTest01();		
	}
}
