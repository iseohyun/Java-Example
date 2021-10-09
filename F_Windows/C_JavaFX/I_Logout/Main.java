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
 *	Controllar에서 logout을 실행하는 것은 버튼에 한정해서 동작합니다. 즉, 우측 상단의 x버튼은 대응하지 못한다는 뜻입니다.
 *	setOnCloseRequest를 통해서 이를 대응할 수 있습니다.
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
		alert.setHeaderText("당신은 지금 로그아웃 하려고 하고 있소만...");
		alert.setContentText("진짜루 갈꺼냐고?");

		if (alert.showAndWait().get() == ButtonType.OK) {
			System.out.println("잘가시게!");
			stage.close();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}