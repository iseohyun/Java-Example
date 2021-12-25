package d_Graphic;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class B2_InetImage extends Frame {
	Image img;
	Toolkit tkit;

	B2_InetImage() {
		addWindowListener(new WindowExit(this));
		
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
		new B2_InetImage();
	}
}

// 실습과제 : 다른 인터넷의 사진을 로딩해 봅니다.