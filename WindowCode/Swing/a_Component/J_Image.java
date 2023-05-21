package a_Component;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class J_Image extends JFrame {
    J_Image() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        setLayout(new FlowLayout());

        // ImageIcon icon = new ImageIcon("source/maple.jpg");
        ImageIcon icon = new ImageIcon("WindowCode/source/maple.jpg");
        JLabel img = new JLabel(icon);
        add(img);
        pack();
    }

    public static void main(String[] args) {
        new J_Image();
    }
}