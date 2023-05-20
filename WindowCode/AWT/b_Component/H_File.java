package b_Component;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;

import a_Basic.WindowExit;

@SuppressWarnings("serial")
public class H_File extends Frame implements ActionListener {
  Button btnOpen = new Button("파일 열기");
  Button btnSave = new Button("다른 이름으로 저장");
  FileDialog fopen = new FileDialog(this, "파일 열기", FileDialog.LOAD);
  FileDialog fsave = new FileDialog(this, "다른 이름으로 저장", FileDialog.SAVE);
  TextArea ta = new TextArea("내용", 33, 80);

  public H_File() {
    setLayout(new FlowLayout());

    add(btnOpen);
    add(btnSave);
    add(ta);

    btnOpen.addActionListener(this);
    btnSave.addActionListener(this);

    addWindowListener(new WindowExit(this));

    setSize(600, 600);
    setVisible(true);
  }

  public static void main(String[] args) {
    new H_File();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource().equals(btnOpen)) {
      fopen.setVisible(true);
      System.out.print("열린파일 : " + fopen.getDirectory());
      System.out.println(fopen.getFile());
      try {
        File file = new File(fopen.getDirectory() + fopen.getFile());
        ta.setText("");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
          ta.setText(ta.getText() + line + "\n");
        }
        br.close();
      } catch (Throwable t) {
        System.out.println("파일이 열리지 않았습니다.");
      }
    } else {
      fsave.setVisible(true);
      File file = new File(fsave.getDirectory()+fsave.getFile());
      OutputStream stream;
      try {
        stream = new FileOutputStream(file);
        stream.write(ta.getText().getBytes());
        stream.close();
      } catch (Exception e1) {
        e1.printStackTrace();
      }
    }
  }
}
// 실습과제 : FileDialog클래스를 만드시오.
//		FileDialog는 2가지 메소드를 갖습니다.
//		1. open()은 open 다이얼로그를 호출하고, 내용을 연결된 출력상자로 출력합니다.
//		2. save()는 save 다이얼로그를 호출하고, 연결된 출력상자의 내용을 저장합니다.