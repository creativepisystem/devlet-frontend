package br.com.devlet.frontend;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX
 */
public class Login extends Application {

	private static Stage stage;
    
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene =  new Scene(root);
        stage.setTitle("Login");
        stage.setScene(scene);
        
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
        stage.setX(primaryScreenBounds.getMinX());
        stage.setY(primaryScreenBounds.getMinY());
        stage.setWidth(primaryScreenBounds.getWidth());
        stage.setHeight(primaryScreenBounds.getHeight());
        setStage(stage);
        stage.show();
    }

    public static Stage getStage() {
    	return stage;
    }
    
    public void setStage(Stage stage) {
    	Login.stage = stage;
    }
}