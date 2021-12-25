package e_examples;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class TextOut extends Frame implements ActionListener{
	Button btn1 = new Button("�����ּ���");
	TextArea ta = new TextArea();
	
	public TextOut() {
		add("North", btn1);
		add("Center", ta);
		
		btn1.addActionListener(this);
		
		addWindowListener(new WindowExit(this));
		
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextOut();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		btn1.setBackground(Color.GREEN);
		ta.setText(ta.getText()+"��ư�� ���Ⱦ��.\n");
	}
}

// �ǽ����� : "��ư�� ���Ⱦ��(����)"�� ��µǵ��� ����� �ּ���.
//     ���ڴ� ����ؼ� �����մϴ�. ������� "��ư�� ���Ⱦ��(1)" -> "��ư�� ���Ⱦ��(2)" -> "��ư�� ���Ⱦ��(3)"