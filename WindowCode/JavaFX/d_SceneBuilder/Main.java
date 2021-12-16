package d_SceneBuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 
 * @author Seohyun Jung
 *
 *
 * SceneBuilder 설치방법(다운로드: 아래)
 * https://gluonhq.com/products/scene-builder/
 * Window -> Preference -> JavaFx -> SceneBuilder excutable : 디렉토리 설정 -> 설치된 디렉토리
 *  예 : C:\Users\Seohyun Jung\AppData\Local\SceneBuilder\SceneBuilder.exe 또는
 *  예 : C:\Program Files\SceneBuilder\SceneBuilder.exe
 *  
 *  실행 방법
 *  ???.fxml 우클릭 ->  Open with SceneBuilder
 *
 */


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}