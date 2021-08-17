package A_Component;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
 
public class A_Button extends Application implements EventHandler<ActionEvent> {
	// 라이브러리 추가 방법
	// Properties > Java Build Path > Libraries
	// Modulepath > (활성화) Add External JARs.. > *.jar파일 추가

	// Arguments 추가 방법
	// Run/Debug Setting > 리스트 창에서 해당 class 더블클릭
	// Arguments > VM arguments에 추가
	// --module-path "설치한 폴더" --add-modules=javafx.controls,javafx.fxml
	// 예를들어 :
	// --module-path "C:\Program Files\Java\javafx-sdk-16" --add-modules=javafx.controls,javafx.fxml

    Button button1;
    Button button2;
    Label label1;
 
    @Override
    public void start(Stage primaryStage) throws Exception{
 
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(10));
        hbox.setSpacing(10);

        label1 = new Label("Label 1");
        label1.setFont(new Font("Arial", 30));
 
        primaryStage.setTitle("Button");
        button1 = new Button("Button 1");
        button1.setOnAction(this);
        button1.setPrefSize(100, 30);
 
        button2 = new Button("Button 2");
        button2.setOnAction(this);
        button2.setPrefSize(100, 30);
 
        hbox.getChildren().add(label1);
        hbox.getChildren().add(button1);
        hbox.getChildren().add(button2);
        
        primaryStage.setScene(new Scene(hbox, 500, 300));
        primaryStage.show();
    }
 
    @Override
    public void handle(ActionEvent actionEvent) {
        if(actionEvent.getSource() == button1){
            System.out.println("CLICKED Button 1");
        }
 
        if(actionEvent.getSource() == button2){
            System.out.println("CLICKED Button 2");
        }
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}