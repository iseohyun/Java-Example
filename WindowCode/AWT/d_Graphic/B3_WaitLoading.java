package d_Graphic;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.net.URL;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class B3_WaitLoading extends Frame {
  Image[] img = new Image[2];;
  Toolkit tkit = getToolkit();

  public B3_WaitLoading() {
    addWindowListener(new WindowExit(this));

    setVisible(true);
    setSize(450, 250);

    try {
      URL url = new URL("https://docs.oracle.com/javase/tutorial/figures/2d/2D-1.gif");
      img[0] = tkit.getImage(url);
      url = new URL("https://docs.oracle.com/javase/tutorial/figures/2d/2D-2.gif");
      img[1] = tkit.getImage(url);

      MediaTracker mTracker = new MediaTracker(this);

      mTracker.addImage(img[0], 0);
      mTracker.addImage(img[1], 1);

      System.out.println("이미지 로딩중...");

      mTracker.waitForAll();
      if (mTracker.isErrorAny()) {
        System.out.println("이미지 오류");
        // System.exit(1);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void paint(Graphics g) {
    g.drawImage(img[0], 20, 30, this);
    g.drawImage(img[1], 20, 160, this);
  }

  public static void main(String[] args) {
    new B3_WaitLoading();
  }
}