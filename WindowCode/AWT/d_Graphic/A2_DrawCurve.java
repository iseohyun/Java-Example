package d_Graphic;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.QuadCurve2D;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class A2_DrawCurve extends Frame {
  A2_DrawCurve() {
    addWindowListener(new WindowExit(this));

    setSize(300, 450);
    setVisible(true);
  }

  public void paint(Graphics g) {
    int grid = 50;
    int height = getSize().height;
    int width = getSize().width;
    g.setColor(Color.LIGHT_GRAY);
    for (int i = grid; i < width; i += grid) {
      g.drawString(Integer.toString(i).concat("-x"), i, 50);
      g.drawLine(i, 0, i, height);
    }
    for (int i = grid; i < height; i += grid) {
      g.drawString(Integer.toString(i).concat("-y"), 10, i);
      g.drawLine(0, i, width, i);
    }
    g.setColor(Color.black);

    Graphics2D g2 = (Graphics2D) g;

    QuadCurve2D q = new QuadCurve2D.Float();

    g2.setStroke(new BasicStroke(5, BasicStroke.CAP_ROUND, 0));
    
    q.setCurve(50, 150, 100, 100, 150, 150);
    g2.setColor(Color.red);
    g2.draw(q);
    
    q.setCurve(150, 150, 200, 100, 250, 150);
    g2.setColor(Color.orange);
    g2.draw(q);
    
    q.setCurve(250, 150, 295, 200, 150, 350);
    g2.setColor(Color.green);
    g2.draw(q);
    
    q.setCurve(150, 350, 5, 200, 50, 150);
    g2.setColor(Color.blue);
    g2.draw(q);
  }

  public static void main(String[] args) {
    new A2_DrawCurve();
  }
}