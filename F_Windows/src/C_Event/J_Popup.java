package C_Event;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class J_Popup extends Frame implements MouseListener{
	PopupMenu pmenu;
	MenuItem fileopen, filesave, exit;
	public J_Popup() {
		addWindowListener(new WindowExit(this));
		pmenu = new PopupMenu();
		fileopen = new MenuItem("파일열기");
		filesave = new MenuItem("파일저장");
		exit = new MenuItem("종료");
		pmenu.add(fileopen);
		pmenu.add(filesave);
		pmenu.add(exit);
		add(pmenu);
		addMouseListener(this);
	}
	public static void main(String[] args) {
		J_Popup test = new J_Popup();
		test.setSize(300, 400);
		test.setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		pmenu.show(this, e.getX(), e.getY());
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
}
