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
				greeting.setText("성인입니다.");
			}else {
				greeting.setText("아동입니다.");
			}
		}catch(NumberFormatException e) {
			greeting.setText("숫자가 아님!");
		}
	}

}
