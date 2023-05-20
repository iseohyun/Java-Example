package d_Graphic;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class F3_Scale extends Frame implements ActionListener {
  double scale = 1;

  Panel p1 = new Panel();
  Button flipX = new Button("x축 반전");
  Button flipY = new Button("y축 반전");
  Button scaleUp = new Button("2배 확대");
  Button scaleDown = new Button("1/2로 축소");

  Graphics2D g2;

  public F3_Scale() {
    addWindowListener(new WindowExit(this));

    setVisible(true);
    setSize(800, 800);

    add(p1);
    
    setLayout(new FlowLayout());

    p1.add(flipX);
    p1.add(flipY);
    p1.add(scaleUp);
    p1.add(scaleDown);

    flipX.addActionListener(this);
    flipY.addActionListener(this);
    scaleUp.addActionListener(this);
    scaleDown.addActionListener(this);
  }

  public void paint(Graphics g) {
    if (g2 == null) {
      g2 = (Graphics2D) getGraphics();
      g2.translate(350, 400);
    }

    System.out.println(g2);
    g2.clearRect(-1000, -1000, 2000, 2000);
    g2.draw(new Line2D.Float(-1000, 0, 1000, 0));
    g2.draw(new Line2D.Float(0, -1000, 0, 1000));
    g2.fill(new Ellipse2D.Float(50, 50, 20, 20));
  }

  public static void main(String[] args) {
    new F3_Scale();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == flipX)
      g2.scale(1, -1); // 좌표계를 x축을 중심으로 반전한다
    else if (e.getSource() == flipY)
      g2.scale(-1, 1); // 좌표계를 y축을 중심으로 반전한다.
    else if (e.getSource() == scaleUp)
      g2.scale(2, 2); // 좌표계를 2배 확대한다.
    else if (e.getSource() == scaleDown)
      g2.scale(0.5, 0.5); // 좌표계를 1/2로 축소한다.
    repaint();
  }
}