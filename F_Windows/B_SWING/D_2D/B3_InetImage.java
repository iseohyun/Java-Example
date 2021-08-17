package D_2D;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class B3_InetImage extends JFrame{
	Image img;
	Toolkit tkit;
	
	B3_InetImage() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(650, 507);
		tkit = getToolkit();
		URL url;
		try {
			url = new URL("https://dimg.donga.com/ugc/CDB/WEEKLY/Article/5b/b3/22/85/5bb32285000ed2738de6.jpg");
			img = tkit.getImage(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		tkit.prepareImage(img, -1, -1, this);
	}
	
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}
	
	public static void main(String[] args) {
		new B3_InetImage();
	}
}
