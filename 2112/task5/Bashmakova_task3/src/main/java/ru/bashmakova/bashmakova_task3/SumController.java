package ru.bashmakova.bashmakova_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button btnButton;

    @FXML
    private TextField kgTextField;

    @FXML
    private Label resultLabel;

    @FXML
    void btnButtonOnAction(ActionEvent event) {
        double Kg = Double.parseDouble(kgTextField.getText());
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            result.append("Стоимость ").append(i).append(" кг: ").append(Kg * i).append(" \n");
        }
        resultLabel.setText(result.toString());
    }
    }