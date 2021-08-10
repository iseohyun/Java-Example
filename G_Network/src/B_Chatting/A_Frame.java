package B_Chatting;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class A_Frame extends JFrame implements KeyListener, ActionListener{
	GridBagLayout grid = new GridBagLayout();
	JTextArea view = new JTextArea(20, 40);
	JTextArea input = new JTextArea(10, 40);
	JLabel pTxt = new JLabel("전할 메시지 :(연결안됨)");
	JMenu menu = new JMenu("연결");
	JMenuItem connect = new JMenuItem("연결하기");
	JMenuItem discon = new JMenuItem("끊기");
	JMenuBar bar = new JMenuBar();
	
	A_Frame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(grid);
		SetPos(bar, 0, 3);
		bar.add(menu);
		menu.add(connect);
		connect.addActionListener(this);
		menu.add(discon);
		discon.addActionListener(this);
		
		SetPos(view, 0, 0);
		view.setEnabled(false);
		view.setBackground(getForeground());
		view.setDisabledTextColor(Color.black);
		
		SetPos(pTxt, 0, 1);
		
		SetPos(input, 0, 2);
		input.addKeyListener(this);
		input.requestFocus();
		
		pack();
		setVisible(true);
	}
	
	public void SetPos(Component c, int x, int y) {
		GridBagConstraints g = new GridBagConstraints();
		g.fill= GridBagConstraints.BOTH;
		g.gridx = x;
		g.gridy = y;
		grid.setConstraints(c, g);
		add(c);
		System.out.println(c.toString());
	}
	
	public static void main(String[] args) {
		new A_Frame();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == '\n') {
			view.setText(view.getText() + "\n 나 : \n" + input.getText());
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == '\n') {
			input.setText("");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
