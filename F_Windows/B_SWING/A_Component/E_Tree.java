package A_Component;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

@SuppressWarnings("serial")
public class E_Tree extends JFrame implements TreeSelectionListener{
	JPanel pn = new JPanel();
	JTree tr = new JTree();
	JTextField  path = new JTextField();
	
	E_Tree(){
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		setContentPane(pn);
		setLayout(new BorderLayout());
		
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
	}
}
