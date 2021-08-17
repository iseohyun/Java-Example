package A_Component;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.Pane;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class I_LogoutCtrl {

	@FXML
	Button LogoutBtn;
	@FXML
	Pane LogoutPane;
	
	Stage stage;
	
	public void logout(ActionEvent e) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("logout");
		alert.setHeaderText("����� ���� �α׾ƿ� �Ϸ��� �ϰ� �ּҸ�...");
		alert.setContentText("��¥�� �����İ�?");
		
		if(alert.showAndWait().get() == ButtonType.OK) {
			stage = (Stage) LogoutPane.getScene().getWindow();
			System.out.println("�߰��ð�!");
			stage.close();
		}
	}
}
