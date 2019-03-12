package sample;


import javafx.fxml.FXML;

import javafx.scene.control.*;

public class Controller {

    @FXML
    TextField textInput;

    @FXML
    TextField textOutput;

    public void onButtonClick(){
        textOutput.setText(textInput.getText());
        textInput.setText("");
    }
}
