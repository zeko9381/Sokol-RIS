module fri.ris.sokolris {
    requires javafx.controls;
    requires javafx.fxml;
            
                        requires org.kordamp.bootstrapfx.core;
            
    opens fri.ris.sokolris to javafx.fxml;
    exports fri.ris.sokolris;
}