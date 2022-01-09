package b_FullScreen;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * 
 *	Ű���忡 Ư�� Ű�� ������, ȭ���� ������ �� �ֽ��ϴ�. �ڵ带 ���� �ؼ��غ�����.
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
		primaryStage.setFullScreenExitHint("�� ����������.");
		primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}