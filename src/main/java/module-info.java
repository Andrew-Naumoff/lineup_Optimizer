module org.example.lineup_optimizer {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires com.fasterxml.jackson.databind;
    requires javafx.graphics;

    // Open packages for reflection (needed for Jackson and JavaFX FXML)
    opens org.example.lineup_optimizer to javafx.fxml;
    opens org.example.lineup_optimizer.controller to javafx.fxml;
    opens org.example.lineup_optimizer.model to com.fasterxml.jackson.databind;

    // Export packages for access by other modules
    exports org.example.lineup_optimizer;
    exports org.example.lineup_optimizer.controller;
    exports org.example.lineup_optimizer.model;
}