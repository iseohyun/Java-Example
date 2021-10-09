package J_ImageView;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controllar {

	@FXML
	ImageView myImageView;
	Button ChangeImgBtn;

	Image myImage = new Image(getClass().getResourceAsStream("../dog.jpg"));

	public void displayImage() {

		myImageView.setImage(myImage);
	}
}