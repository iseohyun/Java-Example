package A_Component;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class H_LoginCtrl {
	@FXML
	TextField InputUserName;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void login(ActionEvent event) throws IOException {
		String username = InputUserName.getText();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("H_Login2.fxml"));
		root = loader.load();
		H_LoginCtrl2 ctrl2 = loader.getController();
		
		ctrl2.displayName(username);
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
}
