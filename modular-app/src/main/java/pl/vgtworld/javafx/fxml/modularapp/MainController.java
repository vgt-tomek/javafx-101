package pl.vgtworld.javafx.fxml.modularapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class MainController {

	@FXML
	private BorderPane root;

	private FXMLLoader loader = new FXMLLoader();

	public void firstPressed(ActionEvent actionEvent) throws IOException {
		BorderPane firstPane = loader.load(getClass().getResource("first/first.fxml"));
		root.setCenter(firstPane);
	}

	public void secondPressed(ActionEvent actionEvent) throws IOException {
		BorderPane firstPane = loader.load(getClass().getResource("second/second.fxml"));
		root.setCenter(firstPane);
	}
}
