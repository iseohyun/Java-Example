package d_Graphic;

import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class B_Image extends JFrame {
	BufferedImage img;
	final String IMAGE_NAME = "cat.jpg";
	Toolkit tkit = getToolkit();

	public B_Image() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		try {
			img = ImageIO.read(new File(IMAGE_NAME));
		} catch (IOException e) {
			e.printStackTrace();
		}

		setVisible(true);
		setSize(img.getWidth(), img.getHeight());
	}

	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}

	public static void main(String[] args) {
		new B_Image();
	}
}
