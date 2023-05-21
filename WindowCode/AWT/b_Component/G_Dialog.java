package b_Component;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
class DialogTest extends Dialog implements ActionListener {
    public DialogTest(Frame arg0, String msg) {
        super(arg0, "메시지 대화상자", true);
        setLayout(new FlowLayout());

        Label lab = new Label(msg);
        Button b = new Button("종료");

        add(lab);
        add(b);

        setBackground(Color.GRAY);

        b.addActionListener(this);

        setSize(200, 300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
    }
}

@SuppressWarnings("serial")
public class G_Dialog extends Frame implements ActionListener {
    Button b1 = new Button("다이얼로그 열기");
    TextField message = new TextField("여기에 메시지를 입력하세요.");

    public G_Dialog() {
        setLayout(new FlowLayout());

        add(message);
        add(b1);

        b1.addActionListener(this);

        addWindowListener(new WindowExit(this));

        setSize(300, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new G_Dialog();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new DialogTest(this, message.getText());
    }
}

// 실습과제 : 다이얼로그를 하나 더 띄워보세요.
// 실습과제 : red라고 입력하면, 배경이 빨간색인 다이얼로그가 생성되도록 만들어보세요.
// 실습과제 : 다이얼로그가 열리면(호출되면) 메시지 옆에 (1)이란 숫자가 출력되도록 하세요. (예: "여기에 메시지를 입력하세요.(1)")
// 만약 두번째 호출되면 (2)라는 숫자가 출력되도록 하세요. (예: "여기에 메시지를 입력하세요.(2)")
// 호출될 때마다 숫자는 증가합니다. (예: "여기에 메시지를 입력하세요.(3)")