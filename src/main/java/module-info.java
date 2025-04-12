module com.gdse.pos_system {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.gdse.pos_system to javafx.fxml;
    exports com.gdse.pos_system;
}