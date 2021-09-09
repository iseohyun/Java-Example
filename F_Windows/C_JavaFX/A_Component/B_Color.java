package A_Component;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * 
 * @author Seohyun Jung
 * 
 * 		아이콘 기능을 사용하려면 아래 폴더에 해당 파일이 존재해야합니다.
 * 
 *			$(Project_Dir)\bin\cat.jpg
 */

public class B_Color extends Application{
	@Override
	public void start(Stage primaryStage) {
		Group root = new Group();
		Scene scene = new Scene(root, Color.BLACK);

//		Image icon = new Image("cat.jpg");
//		
//		primaryStage.getIcons().add(icon);
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
