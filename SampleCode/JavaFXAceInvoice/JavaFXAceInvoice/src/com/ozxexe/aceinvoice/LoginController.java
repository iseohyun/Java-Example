package com.ozxexe.aceinvoice;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import animatefx.animation.*;
import javafx.scene.layout.AnchorPane;

public class LoginController implements Initializable {
    
    @FXML
    private Circle btnClose;
    @FXML
    private StackPane pnlStack;
    @FXML
    private Pane pnlSignUp;
    @FXML
    private ImageView btnBack;
    @FXML
    private Button btnSignUp;
    @FXML
    private Pane pnlSignIn;
    @FXML
    private AnchorPane archRoot;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(event.getSource().equals(btnSignUp)) {
            new ZoomIn(pnlSignUp).play();
            pnlSignUp.toFront();
        }
    }
    
    @FXML
    private void handleMouseEvent(MouseEvent event) {
        if(event.getSource() == btnClose) {
            new animatefx.animation.FadeOut(archRoot).play();
            System.exit(0);
        }
        if(event.getSource().equals(btnBack)) {
            new ZoomIn(pnlSignIn).play();
            pnlSignIn.toFront();
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
