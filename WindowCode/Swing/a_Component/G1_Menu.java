package a_Component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class G1_Menu extends JFrame implements ActionListener {
    JMenuBar bar = new JMenuBar();
    String[][] strMenu = {
            {"File", "New", "Open File", "Save", "Print"},
            {"Edit", "Redo", "Undo"},
            {"Windows", "View", "Navigation", "Preference"},
            {"Help", "Search", "Contribute"}
    };
    JMenu[] main = new JMenu[strMenu.length];
    JMenuItem[] sub;
    JTextArea view = new JTextArea();

    G1_Menu() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());
        add(bar, BorderLayout.NORTH);
        int idx = 0;
        for (int i = 0; i < strMenu.length; i++)
            for (int j = 1; j < strMenu[i].length; j++)
                idx++;

        sub = new JMenuItem[idx];

        idx = 0;
        for (int i = 0; i < strMenu.length; i++) {
            main[i] = new JMenu(strMenu[i][0]);
            bar.add(main[i]);
            for (int j = 1; j < strMenu[i].length; j++) {
                sub[idx] = new JMenuItem(strMenu[i][j]);
                main[i].add(sub[idx]);
                sub[idx++].addActionListener(this);
            }
        }

        add(view, BorderLayout.CENTER);
        setSize(300, 400);
        pack();
    }

    public static void main(String[] args) {
        new G1_Menu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());

    }
}