package Tarot;

import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Start extends JFrame implements ActionListener {
	JLabel[] img = new JLabel[3];
	JPanel pnCard = new JPanel();
	JButton btn = new JButton("카드 뽑기");
	JTextArea text = new JTextArea(3, 80);

	Tarot tarot = new Tarot(1, true, 2, true, 3, true);

	// 0 : 정방향, 1 : 역방향
	// 카드번호 0 ~ 22
	ImageIcon[][] card = new ImageIcon[2][22];
	ImageIcon noCard;
	static int current = 0;
	int[] cardNo = new int[3];

	Start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		for (int i = 0; i < 22; i++) {
			Image jpg = new ImageIcon("Tarot/TarotCard" + String.format("%02d", i) + ".jpg").getImage()
					.getScaledInstance(200, 350, Image.SCALE_SMOOTH);
			card[0][i] = new ImageIcon(jpg);
			card[1][i] = new ImageIcon(rotate(toBufferedImage(jpg), 180.0));
		}
		Image noCardImg = new ImageIcon("Tarot/TarotNoCard.jpg").getImage().getScaledInstance(200, 350,
				Image.SCALE_SMOOTH);
		noCard = new ImageIcon(noCardImg);

		img[0] = new JLabel(noCard);
		img[1] = new JLabel(noCard);
		img[2] = new JLabel(noCard);

		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		pnCard.setSize(650, 350);
		pnCard.add(img[0]);
		pnCard.add(img[1]);
		pnCard.add(img[2]);

		gbc.gridx = 0;
		gbc.gridy = 0;
		add(pnCard, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.BOTH;
		add(btn, gbc);

		text.setSize(550, 100);
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		add(text, gbc);

		btn.addActionListener(this);

		pack();
		setVisible(true);
	}

	static public BufferedImage rotate(BufferedImage image, Double degrees) {
		// Calculate the new size of the image based on the angle of rotaion
		double radians = Math.toRadians(degrees);
		double sin = Math.abs(Math.sin(radians));
		double cos = Math.abs(Math.cos(radians));
		int newWidth = (int) Math.round(image.getWidth() * cos + image.getHeight() * sin);
		int newHeight = (int) Math.round(image.getWidth() * sin + image.getHeight() * cos);

		// Create a new image
		BufferedImage rotate = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2d = rotate.createGraphics();
		// Calculate the "anchor" point around which the image will be rotated
		int x = (newWidth - image.getWidth()) / 2;
		int y = (newHeight - image.getHeight()) / 2;
		// Transform the origin point around the anchor point
		AffineTransform at = new AffineTransform();
		at.setToRotation(radians, x + (image.getWidth() / 2), y + (image.getHeight() / 2));
		at.translate(x, y);
		g2d.setTransform(at);
		// Paint the originl image
		g2d.drawImage(image, 0, 0, null);
		g2d.dispose();
		return rotate;
	}

	public static BufferedImage toBufferedImage(Image img) {
		if (img instanceof BufferedImage) {
			return (BufferedImage) img;
		}

		// Create a buffered image with transparency
		BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);

		// Draw the image on to the buffered image
		Graphics2D bGr = bimage.createGraphics();
		bGr.drawImage(img, 0, 0, null);
		bGr.dispose();

		// Return the buffered image
		return bimage;
	}

	public static void main(String[] args) {
		new Start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random rand = new Random();
		int num = rand.nextInt(22-current);
		boolean dir = rand.nextInt(2)==1?false:true;
		System.out.println(current + " : " + (dir?"정방향-":"역방향-") + num);
		
		// 카드 숫자 보정 : 같은 카드가 나올 수 없음
		if(current==2) {
			cardNo[2] = num; 
			if(cardNo[2]>=cardNo[0]) cardNo[2]++;
			if(cardNo[2]>=cardNo[1]) cardNo[2]++;
		}else if(current ==1) {
			cardNo[1] = num;
			if(cardNo[1]>=cardNo[0]) cardNo[1]++;
		}else {
			cardNo[0] = num;
		}
		
		img[current] = new JLabel(card[dir?0:1][cardNo[current]]);
		switch(current) {
		case 0:
			tarot.setPast(num, dir);
			pnCard.removeAll();
			img[1] = new JLabel(noCard);
			img[2] = new JLabel(noCard);
			pnCard.add(img[0]);
			pnCard.add(img[1]);
			pnCard.add(img[2]);
			text.setText("과거 (" + cardNo[0] + (dir?"정":"역") + "," + tarot.getString(Time.Past, InfoType.Name) + ") : " + tarot.getString(Time.Past, InfoType.Love));
			break;
		case 1:
			tarot.setCurrent(num, dir);
			pnCard.remove(1);
			pnCard.add(img[1], 1);
			text.setText(text.getText()+"\n현재 (" + cardNo[1] + (dir?"정":"역") + ","  + tarot.getString(Time.Current, InfoType.Name) + ") : " + tarot.getString(Time.Current, InfoType.Love));
			break;
		case 2:
			tarot.setFuture(num, dir);
			pnCard.remove(2);
			pnCard.add(img[2]);
			text.setText(text.getText()+"\n미래 (" + cardNo[2] + (dir?"정":"역") + ","  + tarot.getString(Time.Future, InfoType.Name) + ") : " + tarot.getString(Time.Future, InfoType.Love));
			break;
		}
		
		pnCard.update(getGraphics());
		if(++current>2) current=0;
	}
}