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
			alert.setHeaderText("�ùٸ� �����Դϴ�.");
			alert.setContentText("�ּ��� ���Ǹ� �´´ٸ� �󸶵��� �ٸ� ��ü�� ����� �� �ֽ��ϴ�.");
			alert.setTitle("1��");
		} else if (choice2.isSelected()) {
			alert.setTitle("2��");
			alert.setHeaderText("�ùٸ� �����Դϴ�.");
			alert.setContentText("�ڽ� ��ü�� �θ�ü�� ��� ����� ��ӹ޽��ϴ�.");
		} else if (choice3.isSelected()) {
			alert.setTitle("3��");
			alert.setHeaderText("Ʋ�� �����Դϴ�.(������Լ�)");
			alert.setContentText("Ŭ������ ������ �Լ��� �̷���� �ֽ��ϴ�.");
		} else if (choice4.isSelected()) {
			alert.setTitle("4��");
			alert.setHeaderText("�ùٸ� �����Դϴ�.");
			alert.setContentText("����� ���� �⺻���� �Ӽ��Դϴ�.");
		} else {
			alert.setTitle("������ ���� �ʾҽ��ϴ�.");
			alert.setHeaderText("�絵�� �غ�����.");
			alert.setContentText("������ ����� �Ĵٺ��� �ֽ��ϴ�.");
		}
		alert.show();
	}
}