module ru.bashmakova.listprimer {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bashmakova.listprimer to javafx.fxml;
    exports ru.bashmakova.listprimer;
}