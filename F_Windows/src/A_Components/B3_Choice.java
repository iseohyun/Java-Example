package A_Components;

import java.awt.Choice;
import java.awt.Frame;

class ChoiceTest extends Frame{
	private Choice c;
	ChoiceTest(){
		c = new Choice();
		c.add("첫번째");
		c.add("두번째");
		c.add("세번째");
		c.add("네번째");

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
