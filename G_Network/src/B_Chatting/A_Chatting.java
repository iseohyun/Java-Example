package B_Chatting;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;


public class B_Connect extends JFrame implements KeyListener, ActionListener{
	private static final long serialVersionUID = 1L;
	GridBagLayout grid = new GridBagLayout();
	static JTextArea view = new JTextArea(20, 40);
	JTextArea input = new JTextArea(10, 40);
	JLabel pTxt = new JLabel("전할 메시지 :(연결안됨)");
	JMenu menu = new JMenu("연결");
	JMenuItem connect = new JMenuItem("연결하기");
	JMenuItem discon = new JMenuItem("끊기");
	JMenuItem isConnect = new JMenuItem("확인");
	JMenuBar bar = new JMenuBar();
	
	static ServerSocket server = null;
	static Socket client = new Socket();
	static OutputStream Write;
	final static int DEFAULT_PORT = 4040;
	
	B_Connect() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(grid);
		SetPos(bar, 0, 3);
		bar.add(menu);
		menu.add(connect);
		connect.addActionListener(this);
		menu.add(discon);
		discon.addActionListener(this);
		menu.add(isConnect);
		isConnect.addActionListener(this);
		
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
	
	public static void main(String[] args) {
		new B_Connect();
		view.setText("Server Open : " + DEFAULT_PORT);
		try {
			server = new ServerSocket();
			while(true) {
				server.bind(new InetSocketAddress(InetAddress.getLocalHost(), DEFAULT_PORT));
				Socket client = server.accept();

				Peer ust = new Peer(client, view);
				ust.start();
			}
		}catch(IOException e){
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
				byte[] as = input.getText().getBytes("UTF-8");
				Write.write(as);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
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
		if(e.getSource().equals(connect)){
			try {
				client.connect(new InetSocketAddress(InetAddress.getLocalHost(), DEFAULT_PORT));
				Write = client.getOutputStream();
				view.setText("연결되었습니다.");
				Write.write("연결되었습니다.".getBytes());
				
				Peer ust = new Peer(client, view);
				ust.start();
			} catch (IOException e1) {
			}
		}else if(e.getSource().equals(isConnect)){
			if(client.isConnected()) {
				view.setText("연결 상태");
			}else {
				view.setText("비연결 상태");
			}
		}
	}
}

class Peer extends Thread {
	Socket SS;
	JTextArea view;
	Peer(Socket SS, JTextArea view) {
		this.SS = SS;
		this.view = view;
	}
	
	public void run() {
		while(true) {
			try {
				InputStream IS = SS.getInputStream();
				byte[] bt = new byte[256];
				int size = IS.read(bt);
				String buf = new String(bt, 0, size, "UTF-8");
				view.setText(view.getText() + "\n" +buf);					
			} catch (IOException e) {
			}
		}
	}
}