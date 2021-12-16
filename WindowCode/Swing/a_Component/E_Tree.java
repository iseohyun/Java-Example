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
		
		DefaultMutableTreeNode style = new DefaultMutableTreeNode("��Ÿ��");
		
		DefaultMutableTreeNode color = new DefaultMutableTreeNode("����");
		DefaultMutableTreeNode font = new DefaultMutableTreeNode("��Ʈ");
		style.add(color);
		style.add(font);

		DefaultMutableTreeNode black = new DefaultMutableTreeNode("����");
		DefaultMutableTreeNode white = new DefaultMutableTreeNode("�Ͼ�");
		DefaultMutableTreeNode blue = new DefaultMutableTreeNode("�Ķ�");
		DefaultMutableTreeNode yellow = new DefaultMutableTreeNode("���");
		color.add(black);
		color.add(white);
		color.add(blue);
		color.add(yellow);
		
		DefaultMutableTreeNode Bold = new DefaultMutableTreeNode("����");
		DefaultMutableTreeNode underline = new DefaultMutableTreeNode("����");
		DefaultMutableTreeNode italics = new DefaultMutableTreeNode("���׸�");
		font.add(Bold);
		font.add(underline);
		font.add(italics);
		
		// size�� �־��. 10, 15, 20
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