package C_Event;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class I2_AddFunc extends Frame implements ActionListener{
	private MenuBar bar;
	private Menu file, edit, file_new;
	private MenuItem file_open, file_save, file_exit;
	private MenuItem edit_cut, edit_copy, edit_paste;
	private MenuItem file_new_java, file_new_c;
	private TextArea area;
	private FileDialog fopen, fsave;
	
	public I2_AddFunc() {
		addWindowListener(new WindowExit(this));
		
		bar = new MenuBar();
		file = new Menu("����");
		edit = new Menu("����");
		area = new TextArea();

		bar.add(file);
		bar.add(edit);

		file_new = new Menu("������");
		file_open = new MenuItem("���Ͽ���");
		file_save = new MenuItem("��������");
		file_exit = new MenuItem("����");
		
		fopen = new FileDialog(this, "���Ͽ���", FileDialog.LOAD);
		fsave = new FileDialog(this, "��������", FileDialog.SAVE);
		
		file_new_java = new MenuItem("�ڹ�");
		file_new_c = new MenuItem("C");
		
		edit_cut = new MenuItem("�߶󳻱�");
		edit_copy = new MenuItem("�����ϱ�");
		edit_paste = new MenuItem("�ٿ��ֱ�");
		
		file.add(file_new);    
		file.add(file_open);
		file.add(file_save);
		file.addSeparator();
		file.add(file_exit);
		
		edit.add(edit_cut);
		edit.add(edit_copy);
		edit.add(edit_paste);
		
		file_new.add(file_new_java);
		file_new.add(file_new_c);
		
		setMenuBar(bar);
		add("Center", area);
		
		file_exit.addActionListener(this);
		file_open.addActionListener(this);
		file_save.addActionListener(this);
    }
	public static void main(String[] args) {
		I2_AddFunc mn = new I2_AddFunc();
		mn.setSize(300, 400);
		mn.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("����")) {
			dispose();
		}else if(e.getActionCommand().equals("���Ͽ���")) {
			try {
				fopen.setVisible(true);
				String filepath = fopen.getDirectory() + "\\" + fopen.getFile();
				FileReader freader = new FileReader(filepath);
				BufferedReader br = new BufferedReader(freader);
				String input = null;
				area.setText("");
				while((input = br.readLine()) != null) {
					area.append(input + "\n");
				}
			}catch(Exception err) {
				err.printStackTrace();
			}
		}else {
			try {
				fsave.setVisible(true);
				String filepath = fsave.getDirectory() + "\\" + fsave.getFile();
				FileWriter fw = new FileWriter(filepath);
				fw.write(area.getText());
				fw.close();
			}catch(Exception err) {
				err.printStackTrace();
			}
		}
	}
}
