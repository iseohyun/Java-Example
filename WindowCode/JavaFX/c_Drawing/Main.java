package c_Drawing;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * 
 *         이미지를 출력하기 위해서는 아래 폴더에 해당 파일이 존재해야합니다.
 * 
 *         $(Project_Dir)\bin\cat.jpg
 */

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Group root = new Group();
		Scene scene = new Scene(root, 600, 600, Color.LIGHTSKYBLUE);
		Stage stage = new Stage();

		Text text = new Text();
		Line line = new Line();

		text.setText("Drawing Examples..");
		text.setX(50);
		text.setY(50);
		text.setFont(Font.font("Verdana", 40));

		line.setStartX(100);
		line.setStartY(100);
		line.setEndX(200);
		line.setEndY(100);
		line.setStroke(Color.INDIANRED);
		line.setStrokeWidth(8);
		line.setOpacity(0.5);
		line.setRotate(15);

		Rectangle rect = new Rectangle();
		rect.setX(100);
		rect.setY(200);
		rect.setWidth(100);
		rect.setHeight(50);
		rect.setStroke(Color.AQUA);
		rect.setStrokeWidth(3);
		rect.setFill(Color.BEIGE);

		Polygon triangle = new Polygon();
		triangle.getPoints().setAll(100., 300., 100., 400., 200., 350.);
		triangle.setFill(Color.BISQUE);

		Circle circ = new Circle();
		circ.setCenterX(350);
		circ.setCenterY(150);
		circ.setRadius(50);
		circ.setFill(Color.LIGHTSKYBLUE);
		circ.setStroke(Color.FIREBRICK);
		circ.setStrokeWidth(7);

		Image img = new Image("https://dimg.donga.com/ugc/CDB/WEEKLY/Article/5b/b3/22/85/5bb32285000ed2738de6.jpg");

		
		ImageView imgView = new ImageView(img);
		imgView.setX(100);
		imgView.setY(150);
		imgView.setScaleX(0.5);
		imgView.setScaleY(0.5);

		root.getChildren().add(text);
		root.getChildren().add(line);
		root.getChildren().add(rect);
		root.getChildren().add(triangle);
		root.getChildren().add(circ);
		root.getChildren().add(imgView);

		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}