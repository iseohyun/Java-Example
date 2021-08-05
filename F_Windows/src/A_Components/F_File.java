package A_Components;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class F_File extends Frame implements ActionListener{
	FileDialog fopen, fsave;
	Panel p;
	Button btnOpen, btnSave;
	
	public F_File() {
		p = new Panel();
		btnOpen = new Button("파일 열기");
		btnSave = new Button("파일 저장");
		
		fopen = new FileDialog(this, "파일 열기", FileDialog.LOAD);
		fsave = new FileDialog(this, "파일 저장", FileDialog.SAVE);
		
		p.add(btnOpen);
		p.add(btnSave);
		
		add(p);
		
		btnOpen.addActionListener(this);
		btnSave.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("파일 열기")) {
			fopen.setVisible(true);
			System.out.println(fopen.getDirectory());
			System.out.println(fopen.getFile());
		}else {
			fsave.setVisible(true);
		}
	}

	public static void main(String[] args) {
		F_File fd = new F_File();
		fd.setSize(300, 400);
		fd.setVisible(true);
	}
}
