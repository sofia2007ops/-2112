package ru.bashmakova.bashmakova_task5;

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
    void btnButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(nTextField.getText().toString());
        double[] a = new double[n + 1];
        a[0] = 1;
        for (int k = 1; k <= n; k++) {
            a[k] = k * a[k - 1] + 1.0 / k;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            result.append("a").append(i).append(" = ").append(a[i]).append("\n");
        }
        resultLabel.setText(result.toString());
    }
}