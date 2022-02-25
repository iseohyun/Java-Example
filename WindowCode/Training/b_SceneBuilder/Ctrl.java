package b_SceneBuilder;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Ctrl {
	@FXML
	ImageView img1;
	double X = 0;

	public void move() {
		TranslateTransition translate = new TranslateTransition();

		System.out.println(X);
		translate.setNode(img1);
		translate.setDuration(Duration.millis(500));
		if(X<50) {
			translate.setByX(10);
			X+=10;
		}else {
			translate.setByX(-50);
			X=0;
		}
		translate.play();
	}
}
