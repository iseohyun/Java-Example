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
public class K1_Panel extends JFrame {
    JPanel p = new JPanel();
    JTabbedPane pTab = new JTabbedPane();
    JRootPane pRoot = new JRootPane();
    JInternalFrame pInter = new JInternalFrame();
    JSplitPane pSplit = new JSplitPane();

    public K1_Panel() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pTab);
        ImageIcon icon = new ImageIcon("source/cat.jpg");

        pTab.addTab("일반 패널", p);
        p.add(new JLabel(icon));

        JScrollPane pdef = new JScrollPane(new JLabel(icon));
        pTab.addTab("스크롤 패널", pdef);

        pTab.addTab("내부 프레임", pInter);
        pInter.add(new JLabel(icon));

        JSplitPane p1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        JSplitPane p2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        p1.setRightComponent(new JLabel(icon));
        p1.setLeftComponent(p2);
        p1.setDividerLocation(100);
        p2.setTopComponent(new JLabel(icon));
        p2.setBottomComponent(new JLabel(icon));
        p2.setDividerLocation(100);
        pTab.addTab("스플릿 패널", p1);

        setVisible(true);
        setSize(300, 400);
    }

    public static void main(String[] args) {
        new K1_Panel();
    }
}