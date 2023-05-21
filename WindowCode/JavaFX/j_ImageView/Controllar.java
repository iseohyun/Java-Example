package j_ImageView;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/* WindowCode/bin에 그림파일을 붙여넣습니다. */

public class Controllar {

    @FXML
    ImageView myImageView;
    Button ChangeImgBtn;

    Image myImage = new Image(getClass().getResourceAsStream("../dog.jpg"));

    public void displayImage() {

        myImageView.setImage(myImage);
    }
}