package A_Component;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class H_LoginCtrl2 {
	@FXML
	Label Hello;

	public void displayName(String username) {
		Hello.setText("Hello: " + username);
	}
}