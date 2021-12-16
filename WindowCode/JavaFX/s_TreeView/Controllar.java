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
		TreeItem<String> rootItem = new TreeItem<>("��ü����", new ImageView(new Image("globe.png")));

		TreeItem<String> branchItem1 = new TreeItem<>("�� �׸�");
		TreeItem<String> branchItem2 = new TreeItem<>("�� ����");
		TreeItem<String> branchItem3 = new TreeItem<>("�� ����");

		TreeItem<String> leafItem1 = new TreeItem<>("����");
		TreeItem<String> leafItem2 = new TreeItem<>("����");
		TreeItem<String> leafItem3 = new TreeItem<>("���̷α�");
		TreeItem<String> leafItem4 = new TreeItem<>("����");
		TreeItem<String> leafItem5 = new TreeItem<>("Ŭ����");
		TreeItem<String> leafItem6 = new TreeItem<>("�߶��");
		TreeItem<String> leafItem7 = new TreeItem<>("����");
		TreeItem<String> leafItem8 = new TreeItem<>("��");

		rootItem.getChildren().addAll(branchItem1, branchItem2, branchItem3);

		branchItem1.getChildren().addAll(leafItem1);
		branchItem1.getChildren().addAll(leafItem2);
		branchItem2.getChildren().addAll(leafItem3);
		branchItem2.getChildren().addAll(leafItem4);
		branchItem3.getChildren().addAll(leafItem5);
		branchItem3.getChildren().addAll(leafItem6);
		branchItem3.getChildren().addAll(leafItem7);
		branchItem3.getChildren().addAll(leafItem8);

		// TODO: �ּ��� �ִ� �Ͱ� ���� ���� ��� ���̰� ������?
		// myTreeView.setShowRoot(false);
		myTreeView.setRoot(rootItem);
	}
}