package A_Components;

import java.awt.Frame;
import java.awt.Label;

public class A_LabelTest {
	public static void main(String[] args) {
		Label lab1 = new Label("첫번째 라벨");
		Frame f = new Frame();
		
		f.add(lab1);
		f.setSize(300, 400);
		f.setVisible(true);
	}
}
