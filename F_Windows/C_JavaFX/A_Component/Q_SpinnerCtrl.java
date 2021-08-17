package A_Component;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class Q_SpinnerCtrl implements Initializable{
	@FXML
	Spinner<Integer> SpinValue;
	
	@FXML
	Label TextOut;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("1");
		SpinnerValueFactory<Integer> valuefactory =
				new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10);
		valuefactory.setValue(1);		
		SpinValue.setValueFactory(valuefactory);
		
		TextOut.setText(Integer.toString(SpinValue.getValue()));
		
		SpinValue.valueProperty().addListener(new ChangeListener<Integer>() {
			@Override
			public void changed(ObservableValue<? extends Integer> arg0, Integer arg1, Integer arg2) {
				TextOut.setText(Integer.toString(SpinValue.getValue()));
			}
		});
	}
}
