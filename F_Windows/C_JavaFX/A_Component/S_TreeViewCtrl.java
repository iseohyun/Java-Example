package A_Component;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class S_TreeViewCtrl implements Initializable {
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
		TreeItem<String> rootItem = new TreeItem<>("Files", new ImageView(new Image("folder_icon.jpg")));

		TreeItem<String> branchItem1 = new TreeItem<>("Pictures");
		TreeItem<String> branchItem2 = new TreeItem<>("Videos");
		TreeItem<String> branchItem3 = new TreeItem<>("Music");

		TreeItem<String> leafItem1 = new TreeItem<>("Pictures1");
		TreeItem<String> leafItem2 = new TreeItem<>("Pictures2");
		TreeItem<String> leafItem3 = new TreeItem<>("Videos1");
		TreeItem<String> leafItem4 = new TreeItem<>("Videos2");
		TreeItem<String> leafItem5 = new TreeItem<>("Music1");
		TreeItem<String> leafItem6 = new TreeItem<>("Music2");

		rootItem.getChildren().addAll(branchItem1, branchItem2, branchItem3);

		branchItem1.getChildren().addAll(leafItem1);
		branchItem1.getChildren().addAll(leafItem2);
		branchItem2.getChildren().addAll(leafItem3);
		branchItem2.getChildren().addAll(leafItem4);
		branchItem3.getChildren().addAll(leafItem5);
		branchItem3.getChildren().addAll(leafItem6);

		// TODO: 주석이 있는 것과 없는 것이 어떠한 차이가 있을까?
		// myTreeView.setShowRoot(false);
		myTreeView.setRoot(rootItem);
	}
}