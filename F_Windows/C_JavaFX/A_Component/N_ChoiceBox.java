package A_Component;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class N_ChoiceBox extends Application {

	@Override
	public void start(Stage primaryScene) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("N_ChoiceBox.fxml"));
		Scene scene = new Scene(root);
		primaryScene.setScene(scene);
		primaryScene.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}