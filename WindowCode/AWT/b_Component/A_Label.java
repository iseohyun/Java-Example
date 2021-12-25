package b_Component;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class A_Label extends Frame implements MouseListener {
	
	boolean isStart = false;
	Label lab1 = new Label("저를 클릭해 보세요.");
	Label lab2 = new Label("저를 클릭하시면, 5억원을 드립니다.");

	A_Label() {
		setLayout(new FlowLayout());
		
		add(lab1);
		add(lab2);

		lab1.setBackground(Color.yellow);
		lab2.setBackground(Color.red);
		
		lab1.addMouseListener(this);
		lab2.addMouseListener(this);
		
		addWindowListener(new WindowExit(this));

		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new A_Label();
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("클릭되었습니다.");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(lab1)) {
			System.out.println("마우스 눌림.");
			lab2.setVisible(true);
		}else {
			if(!isStart) {
				System.out.println("이벤트 시작.");
				JOptionPane.showMessageDialog(this, "아직 시작 안했습니다. \n 이제 게임을 시작합니다.");
				lab2.setVisible(false);
			} else {
				JOptionPane.showMessageDialog(this, "5억원에 당첨되셨습니다.");
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스 클릭 해제!");
		lab2.setVisible(false);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("입장하십니다.");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("도망가십니다.");
	}
}