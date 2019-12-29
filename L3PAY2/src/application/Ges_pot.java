package application;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
public class Ges_pot {

	@FXML
	public Button cancel_gespot;
	@FXML
	public void cancel(ActionEvent event) {
		Stage stage = (Stage) cancel_gespot.getScene().getWindow();
		stage.close();
	}
	
}
