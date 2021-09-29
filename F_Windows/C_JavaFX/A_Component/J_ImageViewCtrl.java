package A_Component;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class J_ImageViewCtrl {

	@FXML
	ImageView myImageView;
	Button ChangeImgBtn;

	Image myImage = new Image(getClass().getResourceAsStream("dog.jpg"));

	public void displayImage() {

		myImageView.setImage(myImage);
	}
}