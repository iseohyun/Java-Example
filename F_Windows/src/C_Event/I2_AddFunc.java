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
		file = new Menu("파일");
		edit = new Menu("편집");
		area = new TextArea();

		bar.add(file);
		bar.add(edit);

		file_new = new Menu("새파일");
		file_open = new MenuItem("파일열기");
		file_save = new MenuItem("파일저장");
		file_exit = new MenuItem("종료");
		
		fopen = new FileDialog(this, "파일열기", FileDialog.LOAD);
		fsave = new FileDialog(this, "파일저장", FileDialog.SAVE);
		
		file_new_java = new MenuItem("자바");
		file_new_c = new MenuItem("C");
		
		edit_cut = new MenuItem("잘라내기");
		edit_copy = new MenuItem("복사하기");
		edit_paste = new MenuItem("붙여넣기");
		
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
		if(e.getActionCommand().equals("종료")) {
			dispose();
		}else if(e.getActionCommand().equals("파일열기")) {
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
