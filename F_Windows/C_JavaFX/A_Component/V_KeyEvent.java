package A_Component;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class V_KeyEvent extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {

		// Parent root = FXMLLoader.load(getClass().getResource("V_KeyEvent.fxml"));
		FXMLLoader loader = new FXMLLoader(getClass().getResource("V_KeyEvent.fxml"));

		Parent root = loader.load();
		Scene scene = new Scene(root);

		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent arg0) {
				// System.out.println(arg0.getCode());
				switch (arg0.getCode()) {
				case W:
				case UP:
					V_KeyEventCtrl.moveUp();
					break;
				case S:
				case DOWN:
					V_KeyEventCtrl.moveDown();
					break;
				case A:
				case LEFT:
					V_KeyEventCtrl.moveLeft();
					break;
				case D:
				case RIGHT:
					V_KeyEventCtrl.moveRight();
					break;
				default:
					break;
				}
			}
		});

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}