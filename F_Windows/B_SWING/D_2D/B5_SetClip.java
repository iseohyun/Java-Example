package D_2D;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class B5_SetClip extends JFrame{
	Image img;
	final String IMAGE_NAME = "cat.jpg";
	
	Graphics2D g2;
	
	public B5_SetClip() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(350, 350);
		
		try {
			String path = getClass().getResource("").getPath();
			path = path.substring(0, path.indexOf("bin")).concat(IMAGE_NAME);
			System.out.println(path);
			img = getToolkit().getImage(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void paint(Graphics g) {
		g.translate(-100, -50);
		
		g.setClip(new Ellipse2D.Float(150, 100, 220, 260));
		g.drawImage(img, 0, 0, this);
	}

	public static void main(String[] args) {
		new B5_SetClip();
	}
}
