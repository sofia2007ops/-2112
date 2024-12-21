module ru.bashmakova.bashmakova_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bashmakova.bashmakova_task2 to javafx.fxml;
    exports ru.bashmakova.bashmakova_task2;
}