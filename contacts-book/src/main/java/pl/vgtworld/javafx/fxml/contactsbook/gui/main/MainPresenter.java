package pl.vgtworld.javafx.fxml.contactsbook.gui.main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import pl.vgtworld.javafx.fxml.contactsbook.gui.topmenu.TopmenuView;

import java.net.URL;
import java.util.ResourceBundle;

public class MainPresenter implements Initializable {

	@FXML
	private BorderPane rootPane;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		TopmenuView menu = new TopmenuView();
		rootPane.setTop(menu.getView());
	}
}
