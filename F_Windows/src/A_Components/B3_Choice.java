package A_Components;

import java.awt.Choice;
import java.awt.Frame;

class ChoiceTest extends Frame{
	private Choice c;
	ChoiceTest(){
		c = new Choice();
		c.add("ù��°");
		c.add("�ι�°");
		c.add("����°");
		c.add("�׹�°");

		add(c);
		
		setSize(300, 400);
		setVisible(true);
	}
}
public class B3_Choice {
	public static void main(String[] args) {
		ChoiceTest f = new ChoiceTest();
	}
}
