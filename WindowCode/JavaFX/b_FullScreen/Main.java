package b_FullScreen;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * 
 *	키보드에 특정 키를 누르면, 화면을 종료할 수 있습니다. 코드를 보고 해석해보세요.
 * 
 */

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Group root = new Group();
		Scene scene = new Scene(root, Color.BLACK);

		primaryStage.setWidth(400);
		primaryStage.setHeight(400);
		primaryStage.setTitle("Java FX : Hello");
		primaryStage.setResizable(false);
		primaryStage.setX(150);
		primaryStage.setY(100);
		primaryStage.setFullScreen(true);
		primaryStage.setScene(scene);
		primaryStage.setFullScreenExitHint("넌 못지나간다.");
		primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}