module se2203.exercise2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens se2203.exercise2 to javafx.fxml;
    exports se2203.exercise2;
}