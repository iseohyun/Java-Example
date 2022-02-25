package l_Quiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.RadioButton;

public class Controllar {
	@FXML
	RadioButton choice1, choice2, choice3, choice4;

	String Title, Message;

	public void submit(ActionEvent event) {

		Alert alert = new Alert(AlertType.INFORMATION);

		if (choice1.isSelected()) {
			alert.setHeaderText("올바른 문장입니다.");
			alert.setContentText("최소의 조건만 맞는다면 얼마든지 다른 객체를 사용할 수 있습니다.");
			alert.setTitle("1번");
		} else if (choice2.isSelected()) {
			alert.setTitle("2번");
			alert.setHeaderText("올바른 문장입니다.");
			alert.setContentText("자식 객체는 부모객체의 모든 기능을 상속받습니다.");
		} else if (choice3.isSelected()) {
			alert.setTitle("3번");
			alert.setHeaderText("틀린 문장입니다.(상수→함수)");
			alert.setContentText("클래스는 변수와 함수로 이루어져 있습니다.");
		} else if (choice4.isSelected()) {
			alert.setTitle("4번");
			alert.setHeaderText("올바른 문장입니다.");
			alert.setContentText("상속의 가장 기본적인 속성입니다.");
		} else {
			alert.setTitle("선택을 하지 않았습니다.");
			alert.setHeaderText("재도전 해보세요.");
			alert.setContentText("정답이 당신을 쳐다보고 있습니다.");
		}
		alert.show();
	}
}