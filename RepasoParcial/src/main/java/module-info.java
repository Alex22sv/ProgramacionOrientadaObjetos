module org.alexsv.repasoparcial {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.alexsv.repasoparcial to javafx.fxml;
    exports org.alexsv.repasoparcial;
}