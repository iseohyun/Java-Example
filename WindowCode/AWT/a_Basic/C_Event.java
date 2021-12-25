package a_Basic;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class C_Event extends Frame implements ActionListener {
	private Button b = new Button("눌러주세요");

	C_Event() {
		add(b);

		// 1. Event는 컴퓨터가 동작을 하게 되는 모든 계기가 되는 행위를 말합니다.
		//   사용자가 키보드를 누르거나, 눌렀던 키보드에서 손을 떼거나, 마우스를 움직이거나, 클릭을 하거나 모든 행위
		//	 특정한 시간이 지났거나, 특정한 프로그램이 실행되었거나, 누군가가 나에게 파일을 보냈거나, 누가 내 컴퓨터에 접속을 했거나,
		//	 컴퓨터가 감지할 수 있는 모든 행위는 모두 이벤트가 될 수 있습니다.
		//	 Event를 감지하는 것을 Listen이라고 합니다.
		b.addActionListener(this);

		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new C_Event();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼이 눌림");
	}
}

// 실습과제 : 버튼을 하나 더 만들고, 해당 버튼이 눌렸을 때도, 버튼이 눌림이라는 메시지가 출력되도록 바꾸어 봅니다.