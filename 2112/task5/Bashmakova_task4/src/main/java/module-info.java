module ru.bashmakova.bashmakova_task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bashmakova.bashmakova_task4 to javafx.fxml;
    exports ru.bashmakova.bashmakova_task4;
}