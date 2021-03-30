package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controller {
    @FXML
    public TextArea textArea;

    @FXML
    public TextField textField;

    @FXML
    public void btnSend(ActionEvent actionEvent) {
    textArea.appendText((textField.getText() + "\n"));
    textField.clear();
    textField.requestFocus();
    }
}
