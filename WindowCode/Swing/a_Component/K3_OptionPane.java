package a_Component;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class K3_OptionPane extends JFrame implements ActionListener {
    JButton input = new JButton("input");
    JButton confirm = new JButton("Confirm");
    JButton InConfirm = new JButton("InConfirm");
    JButton message = new JButton("Message");
    JPanel p = new JPanel();

    JTextField output = new JTextField(10);

    public K3_OptionPane() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(input);
        add(confirm);
        add(InConfirm);
        add(message);
        add(output);
        add(p);

        input.addActionListener(this);
        confirm.addActionListener(this);
        InConfirm.addActionListener(this);
        message.addActionListener(this);

        setSize(300, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new K3_OptionPane();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == input)
            output.setText(JOptionPane.showInputDialog("입력하세요"));

        if (e.getSource() == confirm)
            output.setText(Integer.toString(JOptionPane.showConfirmDialog(this, "확인")));

        if (e.getSource() == InConfirm)
            output.setText(Integer.toString(JOptionPane.showInternalConfirmDialog(p, "확인")));

        if (e.getSource() == message)
            JOptionPane.showMessageDialog(this, "메세지 출력");
    }
}