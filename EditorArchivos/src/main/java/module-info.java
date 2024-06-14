module org.alexsv.editorarchivos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens org.alexsv.editorarchivos to javafx.fxml;
    exports org.alexsv.editorarchivos;
}