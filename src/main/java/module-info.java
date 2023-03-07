module eus.ehu.customcell {
    requires javafx.controls;
    requires javafx.fxml;
            
                        requires org.kordamp.bootstrapfx.core;
            
    opens eus.ehu.customcell to javafx.fxml;
    exports eus.ehu.customcell;
}