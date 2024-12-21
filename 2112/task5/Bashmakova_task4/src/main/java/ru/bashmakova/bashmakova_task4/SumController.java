package ru.bashmakova.bashmakova_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button btnButton;

    @FXML
    private TextField nTextField;

    @FXML
    private Label resultLabel;

    @FXML
    private TextField xTextField;

    @FXML
    void btnButtonOnAction(ActionEvent event) {
        double X = Double.parseDouble(xTextField.getText().toString());
        int N = Integer.parseInt(nTextField.getText().toString());
        double result = 0;
        for (int i = 1; i <= N; i++) {
            result += (Math.pow(-1, i - 1) * Math.pow(X, i)) / i;
        }
        resultLabel.setText("ln(1 + " + X + ") ≈ " + result);
    }
    }