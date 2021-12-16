package a_Component;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

@SuppressWarnings("serial")
public class E_Tree extends JFrame implements TreeSelectionListener {
	JPanel pn = new JPanel();
	JTree tr;
	JTextField path = new JTextField();

	E_Tree() {
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		setContentPane(pn);
		setLayout(new BorderLayout());
		
		DefaultMutableTreeNode style = new DefaultMutableTreeNode("스타일");
		
		DefaultMutableTreeNode color = new DefaultMutableTreeNode("색상");
		DefaultMutableTreeNode font = new DefaultMutableTreeNode("폰트");
		style.add(color);
		style.add(font);

		DefaultMutableTreeNode black = new DefaultMutableTreeNode("검정");
		DefaultMutableTreeNode white = new DefaultMutableTreeNode("하양");
		DefaultMutableTreeNode blue = new DefaultMutableTreeNode("파랑");
		DefaultMutableTreeNode yellow = new DefaultMutableTreeNode("노랑");
		color.add(black);
		color.add(white);
		color.add(blue);
		color.add(yellow);
		
		DefaultMutableTreeNode Bold = new DefaultMutableTreeNode("굵게");
		DefaultMutableTreeNode underline = new DefaultMutableTreeNode("밑줄");
		DefaultMutableTreeNode italics = new DefaultMutableTreeNode("이테릭");
		font.add(Bold);
		font.add(underline);
		font.add(italics);
		
		// size를 넣어보자. 10, 15, 20
		tr = new JTree(style);
		
		pn.add(tr);
		tr.setBounds(0, 0, 300, 350);
		tr.addTreeSelectionListener(this);

		pn.add(path, "South");
		pn.setEnabled(false);
	}

	public static void main(String[] args) {
		new E_Tree();
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		// TODO Auto-generated method stub
		path.setText(e.getPath().toString());
		System.out.println(e.getPath().toString());
	}
}