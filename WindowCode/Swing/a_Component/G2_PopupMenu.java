package a_Component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class G2_PopupMenu extends JFrame implements ActionListener, MouseListener {
  JMenuBar bar = new JMenuBar();
  JPopupMenu popup = new JPopupMenu();
  String[][] strMenu = {
      {"File", "New", "Open File", "Save", "Print"},
      {"Edit", "Redo", "Undo"},
      {"Windows", "View", "Navigation", "Preference"},
      {"Help", "Search", "Contribute"}
  };
  JMenu[] main = new JMenu[strMenu.length];
  JMenu[] PopMain = new JMenu[strMenu.length];
  JMenuItem[] sub;
  JMenuItem[] PopSub;
  JTextArea view = new JTextArea();

  G2_PopupMenu() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);

    // Layout
    setLayout(new BorderLayout());
    add(bar, BorderLayout.NORTH);
    add(view, BorderLayout.SOUTH);
    setSize(300, 400);

    // Create MenuBar
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

    // Create Popup Menu
    PopSub = new JMenuItem[idx];

    idx = 0;
    for (int i = 0; i < strMenu.length; i++) {
      PopMain[i] = new JMenu(strMenu[i][0]);
      popup.add(PopMain[i]);
      for (int j = 1; j < strMenu[i].length; j++) {
        PopSub[idx] = new JMenuItem(strMenu[i][j]);
        PopMain[i].add(PopSub[idx]);
        PopSub[idx++].addActionListener(this);
      }
    }

    addMouseListener(this);
  }

  public static void main(String[] args) {
    new G2_PopupMenu();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String src = "Menu : ";
    for (int i = 0; i < PopSub.length; i++) {
      if (e.getSource().equals(PopSub[i])) {
        src = "Popup : ";
        break;
      }
    }

    view.setText(src + e.getActionCommand());

  }

  @Override
  public void mouseClicked(MouseEvent e) {
  }

  @Override
  public void mousePressed(MouseEvent e) {
  }

  @Override
  public void mouseReleased(MouseEvent e) {
    if (e.getButton() == MouseEvent.BUTTON3) {
      popup.show(this, e.getX(), e.getY());
    }
  }

  @Override
  public void mouseEntered(MouseEvent e) {
  }

  @Override
  public void mouseExited(MouseEvent e) {
  }
}