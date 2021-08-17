package D_2D;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class A_DrawFigures extends JFrame{
	A_DrawFigures(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(300,450);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		int grid = 50;
		int height = getSize().height;
		int width = getSize().width;
		g.setColor(Color.LIGHT_GRAY);
		for(int i = grid; i < width ; i += grid) {
			g.drawString(Integer.toString(i).concat("-x"), i, 50);
			g.drawLine(i, 0, i, height);
		}
		for(int i = grid; i < height ; i += grid) {
			g.drawString(Integer.toString(i).concat("-y"), 10, i);
			g.drawLine(0, i, width, i);
		}
		g.setColor(Color.black);
		
		g.drawRect(60, 60, 100, 50);	// 1�� : �簢��
		
		g.drawRoundRect(60, 160, 80, 50, 30, 30); // 1�� : ���� �ձ� �簢��
		
		g.drawArc(60, 260, 70, 50, 0, 270);	// 1�� : ��ȣ 0 ~ 270��
		
		int[] x = {60, 70, 80, 90, 100, 110};
		int[] y = {360, 410, 360, 410, 360, 410};
		g.drawPolygon(x, y, 6);	// 1�� : �ٰ���
		
		g.fillRect(180, 60, 50, 50);	// 2�� : ���� ä���� �簢��
		
	    g.fillRoundRect(180, 160, 50, 50, 20, 20);	// 2�� : ���� ä���� �ձ� �簢��

	    g.fillOval(180, 260, 70, 50);	// 2�� : ���� ä���� Ÿ��
	    
	    g.clearRect(180, 360, 100, 50);	// 2�� : �ش翵�� �����
	}
	
	public static void main(String[] args) {
		new A_DrawFigures();
	}
}