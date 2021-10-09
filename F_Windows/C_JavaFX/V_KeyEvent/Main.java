package V_KeyEvent;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {

		// Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene.fxml"));

		Parent root = loader.load();
		Scene scene = new Scene(root);

		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent arg0) {
				// System.out.println(arg0.getCode());
				switch (arg0.getCode()) {
				case W:
				case UP:
					Controllar.moveUp();
					break;
				case S:
				case DOWN:
					Controllar.moveDown();
					break;
				case A:
				case LEFT:
					Controllar.moveLeft();
					break;
				case D:
				case RIGHT:
					Controllar.moveRight();
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