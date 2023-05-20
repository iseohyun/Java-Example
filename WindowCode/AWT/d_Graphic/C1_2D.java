package d_Graphic;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class C1_2D extends Frame {
  public C1_2D() {
    addWindowListener(new WindowExit(this));
    setVisible(true);
    setSize(300, 400);
  }

  public void paint(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    Line2D line1 = new Line2D.Double(10.0, 30.0, 100.0, 100.0);
    Line2D line2 = new Line2D.Float(100.0f, 30.0f, 10.0f, 100.0f);

    g2.draw(line1);
    g2.draw(line2);

    Rectangle2D rect1 = new Rectangle2D.Double(10.0, 140.0, 100.0, 100.0);
    Rectangle2D rect2 = new Rectangle2D.Float(150.0f, 140.0f, 100.0f, 100.0f);

    g2.draw(rect1);
    g2.fill(rect2);

    Ellipse2D ellipse1 = new Ellipse2D.Double(10.0, 250.0, 100.0, 100.0);
    Ellipse2D ellipse2 = new Ellipse2D.Float(150.0f, 250.0f, 100.0f, 100.0f);

    g2.draw(ellipse1);
    g2.fill(ellipse2);
  }

  public static void main(String[] args) {
    new C1_2D();
  }
}