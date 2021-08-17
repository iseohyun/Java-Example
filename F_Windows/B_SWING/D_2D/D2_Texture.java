package D_2D;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class D2_Texture extends JFrame{
	Paint tPaint1, tPaint2, tPaint3, tPaint4;
	public D2_Texture() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 300);

		BufferedImage buf = new BufferedImage(10,10,BufferedImage.TYPE_INT_RGB);
		Graphics2D g2buf = (Graphics2D)buf.getGraphics();

		g2buf.setPaint(new Color(100,100,255));
		g2buf.fill(new Ellipse2D.Float(0,0,10,10));

		tPaint1 = new TexturePaint(buf, new Rectangle.Float(10, 50, 10, 10));
		tPaint2 = new TexturePaint(buf, new Rectangle.Float(100, 50, 15, 15));
		tPaint3 = new TexturePaint(buf, new Rectangle.Float(190, 50, 20, 20));
		tPaint4 = new TexturePaint(buf, new Rectangle.Float(280, 50, 25, 25));
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setPaint(tPaint1);
		g2.fill(new Rectangle2D.Double(10, 50, 80, 200));
		g2.setPaint(tPaint2);
		g2.fill(new Rectangle2D.Double(100, 50, 80, 200));
		g2.setPaint(tPaint3);
		g2.fill(new Rectangle2D.Double(190, 50, 80, 200));
		g2.setPaint(tPaint4);
		g2.fill(new Rectangle2D.Double(280, 50, 80, 200));
	}

	public static void main(String[] args) {
		new D2_Texture();
	}
}