package A_Component;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.RadioButton;

public class L_EthicsTestCtrl {
	@FXML
	RadioButton choice1, choice2, choice3, choice4;
	
	String Title, Message;
	public void submit(ActionEvent event) {
		
		Alert alert = new Alert(AlertType.INFORMATION);

		if(choice1.isSelected()) {
			alert.setHeaderText("��.��.��.");
			alert.setContentText("...");
			alert.setTitle("1��");
		}else if(choice2.isSelected()) {
			alert.setTitle("2��");
			alert.setHeaderText("��.��.��.");
			alert.setContentText("����ִ� �ൿ�̱���.");
		}else if(choice3.isSelected()) {
			alert.setTitle("3��");
			alert.setHeaderText("��.��.��.");
			alert.setContentText("��ſ��� ����� �ֱ⸦...");
		}else if(choice4.isSelected()) {
			alert.setTitle("4��");
			alert.setHeaderText("��.��.��.");
			alert.setContentText("ū�ϳ���. �����Ͻ�����.");
		}else{
			alert.setTitle("����");
			alert.setHeaderText("��.��.��.");
			alert.setContentText("Ȯ���� �ƴѰ��� ������, ������ �����~");
		}
		alert.show();
	}
}
