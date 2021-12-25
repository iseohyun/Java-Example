package x_Media;

/**
 * 
 * javafx.media모듈이 추가 됩니다.
 * 기존 모듈 불러오기에 추가해주세요.
 * 
 * --add-modules=javafx.controls,javafx.fxml,javafx.media
 * 
 */

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}