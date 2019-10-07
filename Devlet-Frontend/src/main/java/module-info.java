module devlet {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.unsupported;

    opens devlet to javafx.fxml;
    exports br.com.devlet.frontend;
}