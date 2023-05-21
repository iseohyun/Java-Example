package a_Component;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class I_Chooser extends JFrame implements ActionListener {
    JButton FileOpen = new JButton("Open");
    JButton FileSave = new JButton("Save");
    JButton spoid = new JButton("Color Change");
    JFileChooser file = new JFileChooser();
    Color color;
    JTextArea view = new JTextArea("실제로 파일을 열거나, 저장하지 않습니다.", 15, 20);

    I_Chooser() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());

        add(FileOpen);
        FileOpen.addActionListener(this);
        add(FileSave);
        FileSave.addActionListener(this);
        add(spoid);
        spoid.addActionListener(this);
        add(view);
        view.setLineWrap(true);
        setSize(300, 400);
    }

    public static void main(String[] args) {
        new I_Chooser();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(FileOpen)) {
            file.showOpenDialog(this);
            view.setText("Open : " + file.getSelectedFile() + "\n" + view.getText());
        } else if (e.getSource().equals(FileSave)) {
            file.showSaveDialog(this);
            view.setText("Save : " + file.getSelectedFile() + "\n" + view.getText());
        } else if (e.getSource().equals(spoid)) {
            color = JColorChooser.showDialog(this, getTitle(), getForeground());
            view.setSelectionColor(color);
            spoid.setForeground(color);
        }
    }
}