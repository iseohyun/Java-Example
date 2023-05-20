package a_Component;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class H_Toolbar extends JFrame {
  JToolBar toolbar = new JToolBar();
  JButton btnGo = new JButton("GO");
  JTextField search = new JTextField();

  H_Toolbar() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);

    setLayout(new BorderLayout());

    add(toolbar, BorderLayout.NORTH);

    toolbar.add(new JLabel("Search : "));
    toolbar.add(search);
    toolbar.add(btnGo);
    toolbar.addSeparator();

    setSize(300, 400);
  }

  public static void main(String[] args) {
    new H_Toolbar();
  }
}