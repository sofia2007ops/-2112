module ru.bashmakova.bashmakova_task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bashmakova.bashmakova_task3 to javafx.fxml;
    exports ru.bashmakova.bashmakova_task3;
}