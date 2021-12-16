package y_WebView;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

public class Controllar implements Initializable {

	@FXML
	private Button loadButton;

	@FXML
	private TextField address;

	@FXML
	private WebView myWebView;

	private WebEngine engine;
	private WebHistory history;

	private String homepage;
	private double webZoom;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		engine = myWebView.getEngine();
		homepage = "github.com/iseohyun/Java-Example";
		address.setText(homepage);
		webZoom = 1;
		loadPage();
	}

	public void loadPage() {
		engine.load("https://" + address.getText());
	}

	public void refresh() {
		engine.reload();
	}

	public void zoomIn() {
		webZoom += 0.25;
		myWebView.setZoom(webZoom);
	}

	public void zoomOut() {
		webZoom -= 0.25;
		myWebView.setZoom(webZoom);
	}

	public void displayHistory() {
		history = engine.getHistory();
		ObservableList<WebHistory.Entry> entries = history.getEntries();

		for (WebHistory.Entry entry : entries) {
			System.out.println(entry.getUrl() + " " + entry.getLastVisitedDate());
		}
	}

	public void back() {
		history = engine.getHistory();
		ObservableList<WebHistory.Entry> entries = history.getEntries();
		try {
			history.go(-1);
			address.setText(entries.get(history.getCurrentIndex()).getUrl());
		} catch (Exception e) {
			System.out.println("첫 페이지 입니다 : " + (history.getCurrentIndex() + 1));
		}

	}

	public void forward() {
		history = engine.getHistory();
		ObservableList<WebHistory.Entry> entries = history.getEntries();
		try {
			history.go(1);
			address.setText(entries.get(history.getCurrentIndex()).getUrl());
		} catch (Exception e) {
			System.out.println("마지막 페이지 입니다 : " + (history.getCurrentIndex() + 1));
		}
	}

	public void exeuteJS() {
		engine.executeScript("window.location = \"https://www.youtube.com\";");
	}
}