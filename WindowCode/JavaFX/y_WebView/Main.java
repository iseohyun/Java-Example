package y_WebView;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 
 * @author Seohyun Jung
 *	
 *	모듈 추가 : javafx.web
 *
 *	--module-path "C:\Program Files\Java\javafx-sdk-16" --add-modules=javafx.controls,javafx.fxml,javafx.web
 *
 */


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