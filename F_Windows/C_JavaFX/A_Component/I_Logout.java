package A_Component;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class I_Logout extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("I_Logout.fxml"));
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.show();

		arg0.setOnCloseRequest(event -> {
			event.consume();
			logout(arg0);
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