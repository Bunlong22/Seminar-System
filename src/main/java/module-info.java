module com.example.seminar_system {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.seminar_system to javafx.fxml;
    exports com.example.seminar_system;
}