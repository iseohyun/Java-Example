package w_Animation;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class Controllar implements Initializable {

	@FXML
	private ImageView myImage;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		TranslateTransition translate = new TranslateTransition();
		translate.setNode(myImage);
		translate.setDuration(Duration.millis(1000));
		translate.setCycleCount(TranslateTransition.INDEFINITE);
		translate.setByX(250);
		translate.setByY(250);
		translate.setAutoReverse(true);
		translate.play();

		RotateTransition rotate = new RotateTransition();
		rotate.setNode(myImage);
		rotate.setDuration(Duration.millis(1000));
		rotate.setCycleCount(TranslateTransition.INDEFINITE);
		rotate.setInterpolator(Interpolator.LINEAR);
		rotate.setByAngle(270);
		rotate.setAxis(Rotate.Z_AXIS);
		rotate.setAutoReverse(true);
		rotate.play();
		
		FadeTransition fade = new FadeTransition();
		fade.setNode(myImage);
		fade.setDuration(Duration.millis(1000));
		fade.setCycleCount(TranslateTransition.INDEFINITE);
		fade.setInterpolator(Interpolator.LINEAR);
		fade.setFromValue(1);
		fade.setToValue(0);
		fade.setAutoReverse(false);
		fade.play();
		
		ScaleTransition Scale = new ScaleTransition();
		Scale.setNode(myImage);
		Scale.setDuration(Duration.millis(1000));
		Scale.setCycleCount(TranslateTransition.INDEFINITE);
		Scale.setInterpolator(Interpolator.LINEAR);
		Scale.setByX(2);
		Scale.setByY(2);
		Scale.setAutoReverse(false);
		Scale.play();
	}
}