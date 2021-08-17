package A_Component;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class B_Color extends Application{
	@Override
	public void start(Stage primaryStage) {
		Group root = new Group();
		Scene scene = new Scene(root, Color.BLACK);
		// $(Project_Dir)\bin
		Image icon = new Image("cat.jpg");
		
		primaryStage.getIcons().add(icon);
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
