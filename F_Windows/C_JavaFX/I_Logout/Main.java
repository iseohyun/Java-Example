package I_Logout;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

/**
 * 
 * @author Seohyun Jung
 *
 *	Controllar���� logout�� �����ϴ� ���� ��ư�� �����ؼ� �����մϴ�. ��, ���� ����� x��ư�� �������� ���Ѵٴ� ���Դϴ�.
 *	setOnCloseRequest�� ���ؼ� �̸� ������ �� �ֽ��ϴ�.
 *
 */

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();

		primaryStage.setOnCloseRequest(event -> {
			event.consume();
			logout(primaryStage);
		});
	}

	public void logout(Stage stage) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("logout");
		alert.setHeaderText("����� ���� �α׾ƿ� �Ϸ��� �ϰ� �ּҸ�...");
		alert.setContentText("��¥�� �����İ�?");

		if (alert.showAndWait().get() == ButtonType.OK) {
			System.out.println("�߰��ð�!");
			stage.close();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}