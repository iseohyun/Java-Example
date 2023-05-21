package n_ChoiceBox;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class Controllar implements Initializable {
    @FXML
    private Label textOut;
    @FXML
    private ChoiceBox<String> myChoice;

    private String[] food = { "피자", "스시", "라면" };

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        myChoice.getItems().addAll(food);
        myChoice.setOnAction(this::getFood);
    }

    void getFood(ActionEvent event) {
        textOut.setText(myChoice.getValue());
    }
}