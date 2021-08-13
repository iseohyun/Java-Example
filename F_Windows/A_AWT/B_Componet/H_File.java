package B_Componet;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class H_File extends Frame implements ActionListener{
	private static final long serialVersionUID = 1L;
	Button btnOpen = new Button("파일 열기");
	Button btnSave = new Button("파일 저장");
	FileDialog fopen = new FileDialog(this, "파일 열기", FileDialog.LOAD);
	FileDialog fsave = new FileDialog(this, "파일 저장", FileDialog.SAVE);
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
		if(e.getSource().equals(btnOpen)) {
			fopen.setVisible(true);
			System.out.println(fopen.getDirectory());
			System.out.println(fopen.getFile());
			try {
				File file = new File(fopen.getDirectory()+fopen.getFile());
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
		}else {
			fsave.setVisible(true);
		}
	}
}
