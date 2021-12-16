package s_TreeView;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controllar implements Initializable {
	@FXML
	private TreeView<String> myTreeView;

	public void selectItem() {
		TreeItem<String> item = (TreeItem<String>) myTreeView.getSelectionModel().getSelectedItem();
		if (item != null)
			System.out.println(item.getValue());
	}

	@SuppressWarnings("unchecked")
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		TreeItem<String> rootItem = new TreeItem<>("전체폴더", new ImageView(new Image("globe.png")));

		TreeItem<String> branchItem1 = new TreeItem<>("내 그림");
		TreeItem<String> branchItem2 = new TreeItem<>("내 비디오");
		TreeItem<String> branchItem3 = new TreeItem<>("내 음악");

		TreeItem<String> leafItem1 = new TreeItem<>("사진");
		TreeItem<String> leafItem2 = new TreeItem<>("도면");
		TreeItem<String> leafItem3 = new TreeItem<>("브이로그");
		TreeItem<String> leafItem4 = new TreeItem<>("국내");
		TreeItem<String> leafItem5 = new TreeItem<>("클래식");
		TreeItem<String> leafItem6 = new TreeItem<>("발라드");
		TreeItem<String> leafItem7 = new TreeItem<>("재즈");
		TreeItem<String> leafItem8 = new TreeItem<>("팝");

		rootItem.getChildren().addAll(branchItem1, branchItem2, branchItem3);

		branchItem1.getChildren().addAll(leafItem1);
		branchItem1.getChildren().addAll(leafItem2);
		branchItem2.getChildren().addAll(leafItem3);
		branchItem2.getChildren().addAll(leafItem4);
		branchItem3.getChildren().addAll(leafItem5);
		branchItem3.getChildren().addAll(leafItem6);
		branchItem3.getChildren().addAll(leafItem7);
		branchItem3.getChildren().addAll(leafItem8);

		// TODO: 주석이 있는 것과 없는 것이 어떠한 차이가 있을까?
		// myTreeView.setShowRoot(false);
		myTreeView.setRoot(rootItem);
	}
}