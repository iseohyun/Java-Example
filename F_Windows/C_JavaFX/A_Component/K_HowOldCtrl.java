package A_Component;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class K_HowOldCtrl {
	@FXML
	TextField input;
	@FXML
	Label greeting;
	
	int age;
	
	public void submit(ActionEvent event) {
		try {
			age = Integer.parseInt(input.getText());
			if(age > 18) {
				greeting.setText("�����Դϴ�.");
			}else {
				greeting.setText("�Ƶ��Դϴ�.");
			}
		}catch(NumberFormatException e) {
			greeting.setText("���ڰ� �ƴ�!");
		}
	}

}
