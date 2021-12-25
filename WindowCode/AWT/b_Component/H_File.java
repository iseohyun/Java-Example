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
	Button btnOpen = new Button("���� ����");
	Button btnSave = new Button("�ٸ� �̸����� ����");
	FileDialog fopen = new FileDialog(this, "���� ����", FileDialog.LOAD);
	FileDialog fsave = new FileDialog(this, "�ٸ� �̸����� ����", FileDialog.SAVE);
	TextArea ta = new TextArea("����", 33, 80);

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
			System.out.print("�������� : " + fopen.getDirectory());
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
				System.out.println("������ ������ �ʾҽ��ϴ�.");
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
// �ǽ����� : FileDialogŬ������ ����ÿ�.
//		FileDialog�� 2���� �޼ҵ带 �����ϴ�.
//		1. open()�� open ���̾�α׸� ȣ���ϰ�, ������ ����� ��»��ڷ� ����մϴ�.
//		2. save()�� save ���̾�α׸� ȣ���ϰ�, ����� ��»����� ������ �����մϴ�.