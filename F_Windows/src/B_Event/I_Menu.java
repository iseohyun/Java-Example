package B_Event;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class I_Menu extends Frame{
	private MenuBar bar;
	private Menu file, edit, file_new;
	private MenuItem file_open, file_save, file_exit;
	private MenuItem edit_cut, edit_copy, edit_paste;
	private MenuItem file_new_java, file_new_c;
	public I_Menu() {
		addWindowListener(new WindowExit(this));
		
		bar = new MenuBar();
		file = new Menu("파일");
		edit = new Menu("편집");

		bar.add(file);
		bar.add(edit);
		
		file_new = new Menu("새파일");
		file_open = new MenuItem("파일열기");
		file_save = new MenuItem("파일저장");
		file_exit = new MenuItem("종료");
		
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
    }
	public static void main(String[] args) {
		I_Menu mn = new I_Menu();
		mn.setSize(300, 400);
		mn.setVisible(true);
	}
}
