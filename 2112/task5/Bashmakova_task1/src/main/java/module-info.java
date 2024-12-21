module ru.bashmakova.bashmakova_task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bashmakova.bashmakova_task1 to javafx.fxml;
    exports ru.bashmakova.bashmakova_task1;
}