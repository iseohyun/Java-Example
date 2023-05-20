package c_Event;

import java.awt.AWTException;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class A_Mouse extends JFrame implements KeyListener, MouseListener {
  JLabel TextOut = new JLabel("비밀번호를 입력하세요 : ");
  String strPw = "password";
  JPasswordField Pw = new JPasswordField(8);
  Robot r;
  Point xy;
  boolean OK = false;

  A_Mouse() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    add(TextOut);
    add(Pw);

    Pw.addKeyListener(this);
    Pw.addKeyListener(this);
    addMouseListener(this);

    try {
      r = new Robot();
      r.mouseMove(Pw.getLocation().x, Pw.getLocation().y);
    } catch (AWTException e) {
      e.printStackTrace();
    }

    setVisible(true);
    setSize(200, 200);
  }

  public static void main(String[] args) {
    new A_Mouse();
  }

  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
  }

  @Override
  public void keyReleased(KeyEvent e) {
    if (e.getKeyChar() == '\n') {
      if (strPw.toUpperCase().compareTo(String.valueOf(Pw.getPassword()).toUpperCase()) == 0) {
        System.out.println("성공");
        OK = true;
      } else {
        System.out.println("실패");
      }
    }
  }

  @Override
  public void mouseClicked(MouseEvent e) {
  }

  @Override
  public void mousePressed(MouseEvent e) {
  }

  @Override
  public void mouseReleased(MouseEvent e) {
  }

  @Override
  public void mouseEntered(MouseEvent e) {
  }

  @Override
  public void mouseExited(MouseEvent e) {
    System.out.println("마우스 도망감");
    if (!OK) {
      r.mouseMove(getWidth() / 2, getHeight() / 2);
    }
  }
}