package a_Basic;

import java.awt.Frame;

@SuppressWarnings("serial")
// �� ������ �ٽ��� Frame Ŭ������ ��ӹ޾Ҵٴ� ���Դϴ�.
// C�ڵ忡 ���ؼ� ���� ���� ������ ���α׷��� ������ �� �ֽ��ϴ�.
public class A_Create extends Frame {
	A_Create() {
		
		// 1. â�� ũ�⸦ �����մϴ�.
		setSize(300, 400);
		
		// 2. �Ʒ� �޼��带 �߰����� ������ ���������� ������ �ʽ��ϴ�.
		setVisible(true);
	}

	public static void main(String[] args) {
		// 3. ������ ���α׷��̵�, ��Ʈ��ũ ���α׷��̵� ��� ���α׷��� ������ main�Դϴ�.
		// A_Create myClass = new A_Create(); ���� myClass�� ������ �ʱ� ������ �����Ǿ����ϴ�.
		new A_Create();
	}
}

// �ǽ����� : â�� ũ�⸦ �÷����ô�. 500, 400���� �ٲٸ� ���ο� ���� �� ������� �� ���������?
// �ǽ����� : visible�� �ּ�ó���ϸ� � ���� ����������?