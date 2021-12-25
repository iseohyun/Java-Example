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
	Label lab1 = new Label("���� Ŭ���� ������.");
	Label lab2 = new Label("���� Ŭ���Ͻø�, 5����� �帳�ϴ�.");

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
		System.out.println("Ŭ���Ǿ����ϴ�.");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(lab1)) {
			System.out.println("���콺 ����.");
			lab2.setVisible(true);
		}else {
			if(!isStart) {
				System.out.println("�̺�Ʈ ����.");
				JOptionPane.showMessageDialog(this, "���� ���� ���߽��ϴ�. \n ���� ������ �����մϴ�.");
				lab2.setVisible(false);
			} else {
				JOptionPane.showMessageDialog(this, "5����� ��÷�Ǽ̽��ϴ�.");
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺 Ŭ�� ����!");
		lab2.setVisible(false);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�����Ͻʴϴ�.");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�������ʴϴ�.");
	}
}