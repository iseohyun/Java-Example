package P_Progress;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;

public class Controllar implements Initializable {
	@FXML
	ProgressBar HP;
	@FXML
	Button HealBtn, HitBtn;

	private double hpValue;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		HP.setStyle("-fx-accent: GREEN");
		hpValue = HP.getProgress();
	}

	public void hit(ActionEvent event) {
		hpValue -= 0.10;
		setHP();
	}

	public void heal(ActionEvent event) {
		hpValue += 0.55;
		setHP();
	}

	void setHP() {
		if (hpValue > 0.7) {
			if (hpValue > 1)
				hpValue = 1;
			HP.setStyle("-fx-accent: GREEN");
		} else if (hpValue > 0.4) {
			HP.setStyle("-fx-accent: YELLOW");
		} else {
			if (hpValue < 0)
				hpValue = 0;
			HP.setStyle("-fx-accent: RED");
		}
		HP.setProgress(hpValue);
	}
}