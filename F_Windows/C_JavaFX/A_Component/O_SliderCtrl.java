package A_Component;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class O_SliderCtrl implements Initializable{
	@FXML
	Slider iTemperature;
	
	@FXML
	Label strTemperature;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		strTemperature.setText(Integer.toString((int)iTemperature.getValue()).concat("กษ"));
		iTemperature.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				strTemperature.setText(Integer.toString((int)iTemperature.getValue()).concat("กษ"));
			}
		});
		
		
	}
	
	
}
