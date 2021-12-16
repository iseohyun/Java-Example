package a_Component;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
public class K_Panel extends JFrame {
	JPanel p = new JPanel();
	JTabbedPane pTab = new JTabbedPane();
	JRootPane pRoot = new JRootPane();
	JInternalFrame pInter = new JInternalFrame();
	JSplitPane pSplit = new JSplitPane();

	public K_Panel() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(pTab);
		ImageIcon icon = new ImageIcon("cat.jpg");

		pTab.addTab("�Ϲ� �г�", p);
		p.add(new JLabel(icon));

		JScrollPane pdef = new JScrollPane(new JLabel(icon));
		pTab.addTab("��ũ�� �г�", pdef);

		pTab.addTab("���� ������", pInter);
		pInter.add(new JLabel(icon));

		JSplitPane p1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		JSplitPane p2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		p1.setRightComponent(new JLabel(icon));
		p1.setLeftComponent(p2);
		p1.setDividerLocation(100);
		p2.setTopComponent(new JLabel(icon));
		p2.setBottomComponent(new JLabel(icon));
		p2.setDividerLocation(100);
		pTab.addTab("���ø� �г�", p1);

		setVisible(true);
		setSize(300, 400);
	}

	public static void main(String[] args) {
		new K_Panel();
	}
}