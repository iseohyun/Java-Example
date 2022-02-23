package d_Graphic;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class B_Image extends Frame {
	BufferedImage img;
	final String IMAGE_NAME = "source/cat.jpg";
	Toolkit tkit = getToolkit();

	public B_Image() {
		addWindowListener(new WindowExit(this));
		
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

// 실습과제 : 다른 이미지를 로딩해 봅니다.