package ru.bashmakova.bashmakova_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button btnButton;

    @FXML
    private TextField countTextField;

    @FXML
    private TextField numberTextField;

    @FXML
    private TextField resultLabel;

    @FXML
    void btnButtonOnAction(ActionEvent event) {
        int sum = 0;
        int n = Integer.parseInt(countTextField.getText());
        String[] inputNumbers = numberTextField.getText().split(",");
        for (String numStr : inputNumbers) {
            int number = Integer.parseInt(numStr.trim());
            if (number % 3 == 0 && number % 10 == 4) {
                sum += number;
            }
        }
        resultLabel.setText(String.valueOf(sum));
    }
}