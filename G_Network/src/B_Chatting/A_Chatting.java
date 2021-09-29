package B_Chatting;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
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
import java.util.Calendar;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

public class A_Chatting extends JFrame implements KeyListener, ActionListener {
	private static final long serialVersionUID = 1L;
	Calendar time = Calendar.getInstance();
	JPanel pBot = new JPanel();
	JTabbedPane pCenter = new JTabbedPane();
	JPanel pPeers = new JPanel();
	GridBagLayout grid = new GridBagLayout();
	static JTextPane view = new JTextPane();
	static HTMLEditorKit kit = new HTMLEditorKit();
	static HTMLDocument doc = new HTMLDocument();
	JScrollPane scroll = new JScrollPane(view);
	JTextArea input = new JTextArea();
	JMenu Connect = new JMenu("연결");
	JMenuItem ConnectNow = new JMenuItem("연결하기");
	JMenuItem DisconNow = new JMenuItem("끊기");
	JMenu Setting = new JMenu("설정");
	JMenuItem BgColor = new JMenuItem("배경색 변경");
	JMenuBar bar = new JMenuBar();
	boolean isShift = false;

	static ServerSocket server = null;
	static Socket client = new Socket();
	static OutputStream Write;
	final static int DEFAULT_PORT = 4040;

	A_Chatting() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		add("Center", pCenter);
		add("South", pBot);
		pBot.setPreferredSize(new Dimension((getSize().width), 100));

		pCenter.addTab("채팅", scroll);
		pCenter.addTab("참석자", pPeers);
		pBot.setLayout(new BorderLayout());
		pBot.add("Center", input);
		pBot.add("South", bar);

		view.setAutoscrolls(true);
		view.setContentType("text/html");
		view.setAutoscrolls(true);
		view.setBackground(Color.getHSBColor(220f / 360, 0.2f, 1));
		view.setEditorKit(kit);
		view.setDocument(doc);
		scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

		bar.add(Connect);
		Connect.add(ConnectNow);
		ConnectNow.addActionListener(this);
		Connect.add(DisconNow);
		DisconNow.addActionListener(this);
		bar.add(Setting);
		Setting.add(BgColor);
		BgColor.addActionListener(this);

		input.addKeyListener(this);
		input.requestFocus();
		input.setAutoscrolls(true);

		setSize(400, 700);
		setMinimumSize(new Dimension(250, 300));
		setVisible(true);
	}

	public void SetPos(Component c, int x, int y) {
		SetPos(c, x, y, 1, 1);
	}

	public void SetPos(Component c, int x, int y, int row_span, int col_span) {
		GridBagConstraints g = new GridBagConstraints();
		g.gridwidth = row_span;
		g.gridheight = col_span;
		g.gridx = x;
		g.gridy = y;
		grid.setConstraints(c, g);
		add(c);
	}

	public static void main(String[] args) {
		new A_Chatting();
		try {
			server = new ServerSocket();
			while (true) {
				server.bind(new InetSocketAddress(InetAddress.getLocalHost(), DEFAULT_PORT));
				Socket client = server.accept();
				Write = client.getOutputStream();

				Peer ust = new Peer(client, view, kit, doc);
				ust.start();
			}
		} catch (IOException e) {
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == 16) { // shift
			isShift = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

		switch (e.getKeyCode()) {
		case 10: // Enter
			if (isShift) {
				input.setText(input.getText() + "\n");
				return;
			}
			time.getTime();

			String msg = input.getText();
			@SuppressWarnings("static-access")
			String strtime = (time.get(Calendar.AM_PM) == 1 ? "오후 " : "오전 ") + Integer.toString(time.HOUR) + " : "
					+ Integer.toString(time.MINUTE);
			String str = "<div align=\"right\" style=\"float: right; padding:5px\">"
					+ "<div align=\"right\" bgcolor=yellow "
					+ "style=\"padding: 10px; BORDER-TOP: #bdbdbd 1px dashed; BORDER-RIGHT: #bdbdbd 1px dashed; BORDER-BOTTOM: #bdbdbd 1px dashed; BORDER-LEFT: #bdbdbd 1px dashed;"
					+ "margin-left: 100px; float: right;\">" + msg + "</div>" + strtime + "</div><br>";

			str = str.replaceAll("\n", "<br>");

			try {
				kit.insertHTML(doc, doc.getLength(), str, 0, 0, null);
				view.setCaretPosition(view.getDocument().getLength());

				byte[] as = input.getText().getBytes("UTF-8");
				Write.write(as);
				input.setText("");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			break;
		case 16: // shift
			isShift = false;
			break;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(ConnectNow)) {
			try {
//				client.connect(new InetSocketAddress("192.168.123.34", DEFAULT_PORT));
				client.connect(new InetSocketAddress(InetAddress.getLocalHost(), DEFAULT_PORT));
				Write = client.getOutputStream();
				view.setText("연결되었습니다.");
				Write.write("연결되었습니다.".getBytes());

				Peer ust = new Peer(client, view, kit, doc);
				ust.start();
			} catch (IOException e1) {
			}
		} else if (e.getSource().equals(DisconNow)) {

		} else if (e.getSource().equals(BgColor)) {
			Color color = JColorChooser.showDialog(this, getTitle(), getForeground());
			view.setBackground(color);
		}
	}
}

class Peer extends Thread {
	Socket SS;
	JTextPane view;
	HTMLEditorKit kit;
	HTMLDocument doc;
	Calendar time = Calendar.getInstance();

	Peer(Socket SS, JTextPane view, HTMLEditorKit kit, HTMLDocument doc) {
		this.SS = SS;
		this.view = view;
		this.kit = kit;
		this.doc = doc;
		view.setEditorKit(kit);
		view.setDocument(doc);
		System.out.println(SS);
	}

	public void run() {
		while (true) {
			try {
				InputStream IS = SS.getInputStream();
				byte[] bt = new byte[256];
				int size = IS.read(bt);
				String buf = new String(bt, 0, size, "UTF-8");

				time.getTime();

				@SuppressWarnings("static-access")
				String strtime = (time.get(Calendar.AM_PM) == 1 ? "오후 " : "오전 ") + Integer.toString(time.HOUR) + " : "
						+ Integer.toString(time.MINUTE);
				String str = "<div align=\"left\" style=\"float: right; padding:5px\">"
						+ "<div align=\"left\" bgcolor=white "
						+ "style=\"padding: 10px; BORDER-TOP: #bdbdbd 1px dashed; BORDER-RIGHT: #bdbdbd 1px dashed; BORDER-BOTTOM: #bdbdbd 1px dashed; BORDER-LEFT: #bdbdbd 1px dashed;"
						+ "margin-right: 100px; float: left;\">" + buf + "</div>" + strtime + "</div><br>";

				str = str.replaceAll("\n", "<br>");

				kit.insertHTML(doc, doc.getLength(), str, 0, 0, null);
				view.setCaretPosition(view.getDocument().getLength());
			} catch (Exception e) {
			}
		}
	}
}