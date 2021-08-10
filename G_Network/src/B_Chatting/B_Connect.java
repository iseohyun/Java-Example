package B_Chatting;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class B_Connect extends JFrame implements KeyListener, ActionListener{
	GridBagLayout grid = new GridBagLayout();
	JTextArea view = new JTextArea(20, 40);
	JTextArea input = new JTextArea(10, 40);
	JLabel pTxt = new JLabel("전할 메시지 :(연결안됨)");
	JMenu menu = new JMenu("연결");
	JMenuItem connect = new JMenuItem("연결하기");
	JMenuItem discon = new JMenuItem("끊기");
	JMenuBar bar = new JMenuBar();
	
	static ServerSocket server = null;
	static Socket client = null;
	static BufferedWriter sendbuf;
	static BufferedReader readbuf;
	final static int DEFAULT_PORT = 7776;
	
	B_Connect() {
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
		view.setAutoscrolls(true);
		view.setBackground(getForeground());
		view.setDisabledTextColor(Color.black);
		
		SetPos(pTxt, 0, 1);
		
		SetPos(input, 0, 2);
		input.addKeyListener(this);
		input.requestFocus();
		input.setAutoscrolls(true);
		
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
	}
	
	public void Connect(String address, int port) {
		try {
			client = new Socket(address, port);
			readbuf= new BufferedReader(new InputStreamReader(client.getInputStream()));
			view.setText(view.getText() + "\n" + readbuf.readLine());
		} catch (IOException e) {
			System.out.println("연결되지 않았습니다.");
		}finally {
			
		}
	}
	
	public static void main(String[] args) {
		new B_Connect();
		
		while(true) {
			try {
				server = new ServerSocket(DEFAULT_PORT);
				client = server.accept();
	
				sendbuf = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
				sendbuf.write("연결되었습니다.");
				sendbuf.flush();
			}catch(IOException e){
			}
		}
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
			try {
				sendbuf.write(input.getText().toCharArray());
				sendbuf.flush();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				view.setText(view.getText()+"\n"+"메시지를 전달 할 수 없습니다.");
			}
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
		if(e.getSource().equals(connect)){
			String[] add =	input.getText().split("/");
			if(add[0] == "") add[0] = "127.0.0.1";
			int port;
			try {
				port = Integer.parseInt(add[1]);
			}catch(Exception ee) {
				port = DEFAULT_PORT;
			}
			Connect(add[0], port);
		}else {
			try {
				view.setText(view.getText()+"\n"+"연결을 해제합니다.");
				client.close();
				server.close();
			}catch(IOException ee) {
			}
		}
	}
}