package A_Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class M_PickerCtrl {

	@FXML
	DatePicker myDate;

	@FXML
	Label TextOut;

	@FXML
	ColorPicker ColorPick;

	@FXML
	Pane myPane;

	public void DatePick(ActionEvent event) {
		LocalDate local = myDate.getValue();
		String FormattedDate = local.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		TextOut.setText(FormattedDate);
	}

	public void ColorPick(ActionEvent event) {
		Color myColor = ColorPick.getValue();
		myPane.setBackground(new Background(new BackgroundFill(myColor, null, null)));
	}
}