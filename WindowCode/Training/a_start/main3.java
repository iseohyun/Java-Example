package a_start;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class main3 extends Application implements EventHandler<ActionEvent>{
	Button btn1 = new Button("버튼");
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		btn1.setOnAction(this);
		
		Group root = new Group();
		root.getChildren().add(btn1);
		
		arg0.setScene(new Scene(root, 500, 300));
		arg0.show();
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("버튼이 클릭되었습니다.");
	}
}
