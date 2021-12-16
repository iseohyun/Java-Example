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
 * SceneBuilder ��ġ���(�ٿ�ε�: �Ʒ�)
 * https://gluonhq.com/products/scene-builder/
 * Window -> Preference -> JavaFx -> SceneBuilder excutable : ���丮 ���� -> ��ġ�� ���丮
 *  �� : C:\Users\Seohyun Jung\AppData\Local\SceneBuilder\SceneBuilder.exe �Ǵ�
 *  �� : C:\Program Files\SceneBuilder\SceneBuilder.exe
 *  
 *  ���� ���
 *  ???.fxml ��Ŭ�� ->  Open with SceneBuilder
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