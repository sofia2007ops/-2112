module ru.bashmakova.bashmakova_task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bashmakova.bashmakova_task5 to javafx.fxml;
    exports ru.bashmakova.bashmakova_task5;
}