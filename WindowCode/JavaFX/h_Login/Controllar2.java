package h_Login;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controllar2 {
    @FXML
    Label Hello;

    public void displayName(String username) {
        Hello.setText("Hello: " + username);
    }
}