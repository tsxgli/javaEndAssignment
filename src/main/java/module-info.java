module nl.inholland.endassignment {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jetbrains.annotations;


    opens nl.inholland.endassignment to javafx.fxml;
    exports nl.inholland.endassignment;
}